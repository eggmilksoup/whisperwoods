package dev.itsmeow.whisperwoods.entity;

import dev.itsmeow.imdlib.entity.EntityTypeContainer;
import dev.itsmeow.imdlib.entity.util.EntityTypeContainerContainable;
import dev.itsmeow.imdlib.item.ItemModEntityContainer;
import dev.itsmeow.whisperwoods.init.ModEntities;
import dev.itsmeow.whisperwoods.util.ModPlatformEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class EntityMoth extends EntityAnimalWithTypesAndSizeContainable {

    private static final EntityDataAccessor<Integer> LANDED = SynchedEntityData.defineId(EntityMoth.class, EntityDataSerializers.INT);
    private static final TargetingConditions playerPredicate = (new TargetingConditions()).range(4.0D).allowSameTeam().allowInvulnerable();
    private BlockPos targetPosition;

    public EntityMoth(EntityType<? extends EntityAnimalWithTypesAndSizeContainable> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(LANDED, 1);
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void doPush(Entity entityIn) {
    }

    @Override
    protected void pushEntities() {
    }

    public boolean isLanded() {
        return this.entityData.get(LANDED) != 1;
    }

    public int getLandedInteger() {
        return this.entityData.get(LANDED);
    }

    public void setLanded(Direction direction) {
        if(direction == Direction.UP) {
            throw new RuntimeException("Invalid landing direction!");
        }
        this.entityData.set(LANDED, direction.ordinal());
    }

    public void setNotLanded() {
        this.entityData.set(LANDED, 1);
        // Re-center so moth does not suffocate itself
        this.teleportTo(this.blockPosition().getX() + 0.5D, this.blockPosition().getY() + 0.5D, this.blockPosition().getZ() + 0.5D);
    }

    @Override
    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    @Override
    public void tick() {
        super.tick();
        if(this.isLanded()) {
            this.setDeltaMovement(Vec3.ZERO);
            if(Direction.from3DDataValue(this.getLandedInteger()) != Direction.DOWN) {
                double x = Math.floor(this.getX()) + 0.5D;
                double z = Math.floor(this.getZ()) + 0.5D;
                BlockPos pos = new BlockPos(x, Math.floor(this.getY()) + 0.5D, z);
                BlockPos offset = pos.relative(Direction.from3DDataValue(this.getLandedInteger()));
                BlockPos diff = pos.subtract(offset);
                this.teleportTo(x - ((double) diff.getX()) / 2.778D, Math.floor(this.getY()) + 0.5D, z - ((double) diff.getZ()) / 2.778D);
                this.yRot = 0;
                this.yHeadRot = 0;
            } else {
                this.teleportTo(this.getX(), Math.floor(this.getY()), this.getZ());
            }
        } else {
            this.setDeltaMovement(this.getDeltaMovement().multiply(1.0D, 0.6D, 1.0D));
        }

    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        BlockPos blockpos = this.blockPosition();
        if(this.isLanded()) {
            BlockPos offset = blockpos.relative(Direction.from3DDataValue(this.getLandedInteger()));
            if(this.level.getBlockState(offset).isRedstoneConductor(this.level, offset)) {
                if(this.level.getNearestPlayer(playerPredicate, this) != null || this.getRandom().nextInt(this.isAttractedToLight() ? 500 : 1000) == 0) {
                    this.setNotLanded();
                }
            } else {
                this.setNotLanded();
            }
        }
        if(this.targetPosition == null || this.random.nextInt(30) == 0 || (this.targetPosition.closerThan(this.position(), 1.0D) && !isLightBlock(level.getBlockState(this.targetPosition)))) {
            int i = 12;
            int j = 2;
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            BlockPos destinationBlock = null;
            if(this.isAttractedToLight()) {
                for(int k = 0; k <= j; k = k > 0 ? -k : 1 - k) {
                    for(int l = 0; l < i; ++l) {
                        for(int i1 = 0; i1 <= l; i1 = i1 > 0 ? -i1 : 1 - i1) {
                            for(int j1 = i1 < l && i1 > -l ? l : 0; j1 <= l; j1 = j1 > 0 ? -j1 : 1 - j1) {
                                blockpos$mutableblockpos.set(this.blockPosition()).move(i1, k - 1, j1);
                                BlockState state = level.getBlockState(blockpos$mutableblockpos);
                                if(isLightBlock(state) && (destinationBlock == null || state.getLightEmission() >= level.getBlockState(destinationBlock).getLightEmission())) {
                                    destinationBlock = blockpos$mutableblockpos.immutable();
                                }
                            }
                        }
                    }
                }
            }
            if(destinationBlock != null) {
                this.targetPosition = destinationBlock;
                this.setNotLanded();
            } else {
                boolean found = false;
                if(this.isAttractedToLight()) {
                    for(LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(10))) {
                        for(InteractionHand hand : InteractionHand.values()) {
                            Item held = entity.getItemInHand(hand).getItem();
                            if(held == Items.TORCH || held == Items.LANTERN) {
                                this.targetPosition = entity.blockPosition().offset(0, 1.5, 0);
                                found = true;
                                this.setNotLanded();
                            }
                        }
                    }
                }
                if(!found && this.level.getNearestPlayer(playerPredicate, this) == null && this.getRandom().nextInt(this.isAttractedToLight() ? 80 : 30) == 0) {
                    for(Direction direction : Direction.values()) {
                        if(direction != Direction.UP) {
                            BlockPos offset = blockpos.relative(direction);
                            if(level.getBlockState(offset).isRedstoneConductor(level, offset)) {
                                this.setLanded(direction);
                                this.targetPosition = null;
                                found = true;
                            }
                        }
                    }
                }
                if(!found) {
                    this.targetPosition = new BlockPos(this.getX() + (double) this.random.nextInt(5) - (double) this.random.nextInt(5), this.getY() + (double) this.random.nextInt(4) - 1.0D, this.getZ() + (double) this.random.nextInt(5) - (double) this.random.nextInt(5));
                }
            }
        }
        if(!this.isLanded() && targetPosition != null) {
            double d0 = (double) this.targetPosition.getX() + 0.5D - this.getX();
            double d1 = (double) this.targetPosition.getY() + 0.1D - this.getY();
            double d2 = (double) this.targetPosition.getZ() + 0.5D - this.getZ();
            Vec3 vec3d = this.getDeltaMovement();
            Vec3 vec3d1 = vec3d.add((Math.signum(d0) * 0.5D - vec3d.x) * (double) 0.1F, (Math.signum(d1) * (double) 0.7F - vec3d.y) * (double) 0.1F, (Math.signum(d2) * 0.5D - vec3d.z) * (double) 0.1F);
            float width = this.getContainer().getEntityType().getDimensions().width * 0.8F;
            AABB axisalignedbb = AABB.ofSize(width, 0.1F, width).move(this.getX() + vec3d1.x(), this.getEyeY() + vec3d1.y(), this.getZ() + vec3d1.z());
            boolean collides = this.level.getBlockCollisions(this, axisalignedbb, (state, pos2) -> state.isSuffocating(this.level, pos2)).findAny().isPresent();
            if(collides) {
                vec3d1 = vec3d1.multiply(0.5, 0.5, 0.5);
            }
            this.setDeltaMovement(vec3d1);
            float f = (float) (Mth.atan2(vec3d1.z, vec3d1.x) * (double) (180F / (float) Math.PI)) - 90.0F;
            float f1 = Mth.wrapDegrees(f - this.yRot);
            this.zza = 0.5F;
            this.yRot += f1;
        }
        int moths_req = getContainer().getCustomConfiguration().getInt("moths_to_destroy_torch");
        if(moths_req != 0 && level.getBlockState(this.blockPosition()).getBlock() instanceof TorchBlock && level.getEntitiesOfClass(EntityMoth.class, this.getBoundingBox()).size() >= moths_req && ModPlatformEvents.mobGrief(this.level, this)) {
            BlockState state = level.getBlockState(this.blockPosition());
            Block.dropResources(state, level, this.blockPosition());
            level.setBlockAndUpdate(this.blockPosition(), Blocks.AIR.defaultBlockState());
        }
    }

    public boolean isAttractedToLight() {
        long time = this.level.getDayTime() % 24000L;
        return level.getBrightness(LightLayer.SKY, this.blockPosition()) < 10 || (time >= 13000L && time <= 23000L);
    }

    private static boolean isLightBlock(BlockState blockState) {
        return blockState.getLightEmission() > 0;
    }

    @Override
    protected boolean isMovementNoisy() {
        return false;
    }

    @Override
    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    @Override
    public boolean isIgnoringBlockTriggers() {
        return true;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if(this.isInvulnerableTo(source)) {
            return false;
        } else {
            if(!this.level.isClientSide && this.isLanded()) {
                this.setNotLanded();
            }
            return super.hurt(source, amount);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.entityData.set(LANDED, compound.getInt("Landed"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Landed", this.entityData.get(LANDED));
    }

    @Override
    protected float getRandomizedSize() {
        return (this.random.nextInt(30) + 1F) / 100F + 0.15F;
    }

    @Override
    public boolean canBeLeashed(Player player) {
        return false;
    }

    @Override
    public EntityTypeContainer<EntityMoth> getContainer() {
        return ModEntities.MOTH;
    }

    @Override
    protected EntityAnimalWithTypes getBaseChild() {
        return null;
    }

    @Override
    public EntityTypeContainerContainable<EntityMoth, ItemModEntityContainer<EntityMoth>> getContainableContainer() {
        return ModEntities.MOTH;
    }

    public static void bottleTooltip(EntityTypeContainer<? extends Mob> container, ItemStack stack, Level worldIn, List<Component> tooltip) {
        CompoundTag tag = stack.getTag();
        if(tag != null) {
            if(tag.contains("SizeTag")) {
                tooltip.add(new TextComponent("Size: " + tag.getFloat("SizeTag")).setStyle(Style.EMPTY.applyFormats(ChatFormatting.ITALIC, ChatFormatting.GRAY)));
            }
        }
    }
}
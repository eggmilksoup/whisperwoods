package dev.itsmeow.whisperwoods.client.renderer.tile.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import dev.itsmeow.whisperwoods.client.renderer.entity.model.ModelHirschgeist;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * hirschgeist_skull - CyberCat5555 Created using Tabula 8.0.0
 */
public class ModelHGSkull extends EntityModel<Entity> {
    public ModelRenderer head;
    public ModelRenderer lUpperJaw;
    public ModelRenderer lowerJaw;
    public ModelRenderer snout;
    public ModelRenderer rUpperJaw;
    public ModelRenderer lAntler01;
    public ModelRenderer rAntler01;
    public ModelRenderer lAntler02;
    public ModelRenderer lAntler03;
    public ModelRenderer lAntler08;
    public ModelRenderer lAntler09;
    public ModelRenderer lAntler10;
    public ModelRenderer lAntler04;
    public ModelRenderer lAntler07;
    public ModelRenderer lAntler05;
    public ModelRenderer lAntler06;
    public ModelRenderer lAntler05b;
    public ModelRenderer lAntler07b;
    public ModelRenderer lAntler08b;
    public ModelRenderer lAntler09b;
    public ModelRenderer lAntler09c;
    public ModelRenderer lAntler010b;
    public ModelRenderer rAntler02;
    public ModelRenderer rAntler03;
    public ModelRenderer rAntler08;
    public ModelRenderer rAntler09;
    public ModelRenderer rAntler10;
    public ModelRenderer rAntler04;
    public ModelRenderer rAntler07;
    public ModelRenderer rAntler05;
    public ModelRenderer rAntler06;
    public ModelRenderer rAntler05b;
    public ModelRenderer rAntler07b;
    public ModelRenderer rAntler08b;
    public ModelRenderer rAntler09b;
    public ModelRenderer rAntler09c;
    public ModelRenderer rAntler010b;

    public ModelHGSkull() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rAntler08 = new ModelRenderer(this, 70, 25);
        this.rAntler08.mirror = true;
        this.rAntler08.setRotationPoint(-0.4F, -1.2F, 0.0F);
        this.rAntler08.addBox(-0.5F, -3.0F, -0.5F, 0.9F, 3.0F, 0.9F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler08, 0.3839724354387525F, 0.0F, -0.6108652381980153F);
        this.rAntler07b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler07b.mirror = true;
        this.rAntler07b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler07b.addBox(-0.4F, -2.0F, -0.4F, 0.7F, 2.0F, 0.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler07b, 0.0F, 0.0F, 0.5235987755982988F);
        this.lAntler05b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler05b.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.lAntler05b.addBox(-0.4F, -2.0F, -0.4F, 0.6F, 2.0F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler05b, 0.0F, 0.0F, 0.5235987755982988F);
        this.lAntler09c = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler09c.setRotationPoint(-0.1F, -1.3F, 0.0F);
        this.lAntler09c.addBox(-0.2F, -1.5F, -0.3F, 0.6F, 1.5F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler09c, 0.0F, 0.0F, 0.5235987755982988F);
        this.rAntler08b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler08b.mirror = true;
        this.rAntler08b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler08b.addBox(-0.4F, -2.0F, -0.4F, 0.7F, 2.0F, 0.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler08b, 0.0F, 0.0F, 0.5235987755982988F);
        this.rAntler06 = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler06.mirror = true;
        this.rAntler06.setRotationPoint(-0.3F, -2.4F, 0.0F);
        this.rAntler06.addBox(-0.4F, -2.8F, -0.4F, 0.8F, 3.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler06, 0.0F, 0.0F, -0.8726646259971648F);
        this.rAntler09c = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler09c.mirror = true;
        this.rAntler09c.setRotationPoint(0.1F, -1.3F, 0.0F);
        this.rAntler09c.addBox(-0.2F, -1.5F, -0.3F, 0.6F, 1.5F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler09c, 0.0F, 0.0F, -0.5235987755982988F);
        this.lAntler01 = new ModelRenderer(this, 70, 25);
        this.lAntler01.setRotationPoint(1.5F, -4.5F, -1.0F);
        this.lAntler01.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler01, -0.08726646259971647F, 0.0F, 0.5235987755982988F);
        this.rUpperJaw = new ModelRenderer(this, 86, 13);
        this.rUpperJaw.mirror = true;
        this.rUpperJaw.setRotationPoint(-2.0F, -2.0F, -4.8F);
        this.rUpperJaw.addBox(-1.0F, -1.5F, -6.0F, 2.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rUpperJaw, 0.13962634015954636F, -0.22689280275926282F, 0.0F);
        this.lAntler02 = new ModelRenderer(this, 70, 25);
        this.lAntler02.setRotationPoint(-0.3F, -2.5F, 0.0F);
        this.lAntler02.addBox(-0.7F, -4.0F, -0.7F, 1.5F, 4.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler02, -0.08726646259971647F, 0.0F, 0.7853981633974483F);
        this.rAntler05b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler05b.mirror = true;
        this.rAntler05b.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.rAntler05b.addBox(-0.2F, -2.0F, -0.4F, 0.6F, 2.0F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler05b, 0.0F, 0.0F, -0.5235987755982988F);
        this.head = new ModelRenderer(this, 98, 0);
        this.head.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.head.addBox(-3.0F, -5.1F, -5.1F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.lAntler07 = new ModelRenderer(this, 70, 25);
        this.lAntler07.setRotationPoint(0.3F, -2.2F, 0.0F);
        this.lAntler07.addBox(-0.5F, -3.0F, -0.5F, 0.9F, 3.0F, 0.9F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler07, -0.2617993877991494F, 0.0F, 0.6981317007977318F);
        this.lAntler05 = new ModelRenderer(this, 70, 25);
        this.lAntler05.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.lAntler05.addBox(-0.4F, -2.8F, -0.4F, 0.8F, 3.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler05, 0.0F, 0.0F, 0.5235987755982988F);
        this.rAntler010b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.rAntler010b.mirror = true;
        this.rAntler010b.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.rAntler010b.addBox(-0.3F, -1.5F, -0.4F, 0.6F, 1.5F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler010b, 0.0F, 0.0F, 0.593411945678072F);
        this.lUpperJaw = new ModelRenderer(this, 86, 13);
        this.lUpperJaw.setRotationPoint(2.0F, -2.0F, -4.8F);
        this.lUpperJaw.addBox(-1.0F, -1.5F, -6.0F, 2.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lUpperJaw, 0.13962634015954636F, 0.22689280275926282F, 0.0F);
        this.rAntler02 = new ModelRenderer(this, 70, 25);
        this.rAntler02.mirror = true;
        this.rAntler02.setRotationPoint(0.3F, -2.5F, 0.0F);
        this.rAntler02.addBox(-0.7F, -4.0F, -0.7F, 1.5F, 4.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler02, -0.08726646259971647F, 0.0F, -0.7853981633974483F);
        this.rAntler03 = new ModelRenderer(this, 70, 25);
        this.rAntler03.mirror = true;
        this.rAntler03.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.rAntler03.addBox(-0.7F, -4.0F, -0.69F, 1.5F, 4.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler03, 0.0F, 0.0F, 0.5235987755982988F);
        this.lAntler08 = new ModelRenderer(this, 70, 25);
        this.lAntler08.setRotationPoint(0.4F, -1.2F, 0.0F);
        this.lAntler08.addBox(-0.5F, -3.0F, -0.5F, 0.9F, 3.0F, 0.9F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler08, 0.3839724354387525F, 0.0F, 0.6108652381980153F);
        this.lAntler08b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler08b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler08b.addBox(-0.4F, -2.0F, -0.4F, 0.7F, 2.0F, 0.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler08b, 0.0F, 0.0F, -0.5235987755982988F);
        this.rAntler09 = new ModelRenderer(this, 70, 25);
        this.rAntler09.mirror = true;
        this.rAntler09.setRotationPoint(0.2F, -2.8F, 0.0F);
        this.rAntler09.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler09, -0.3490658503988659F, 0.0F, 1.1344640137963142F);
        this.rAntler09b = new ModelRenderer(this, 70, 25);
        this.rAntler09b.mirror = true;
        this.rAntler09b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler09b.addBox(-0.3F, -1.5F, -0.4F, 0.8F, 1.5F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler09b, 0.22689280275926282F, 0.0F, 0.17453292519943295F);
        this.lAntler06 = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler06.setRotationPoint(0.3F, -2.4F, 0.0F);
        this.lAntler06.addBox(-0.4F, -2.8F, -0.4F, 0.8F, 3.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler06, 0.0F, 0.0F, 0.8726646259971648F);
        this.rAntler10 = new ModelRenderer(this, 70, 25);
        this.rAntler10.mirror = true;
        this.rAntler10.setRotationPoint(0.2F, -0.1F, 0.0F);
        this.rAntler10.addBox(-0.5F, -2.0F, -0.5F, 0.8F, 2.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler10, 0.3490658503988659F, 0.0F, 1.1344640137963142F);
        this.lAntler010b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler010b.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.lAntler010b.addBox(-0.3F, -1.5F, -0.4F, 0.6F, 1.5F, 0.6F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler010b, 0.0F, 0.0F, -0.593411945678072F);
        this.lAntler10 = new ModelRenderer(this, 70, 25);
        this.lAntler10.setRotationPoint(-0.2F, -0.1F, 0.0F);
        this.lAntler10.addBox(-0.5F, -2.0F, -0.5F, 0.8F, 2.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler10, 0.3490658503988659F, 0.0F, -1.1344640137963142F);
        this.rAntler01 = new ModelRenderer(this, 70, 25);
        this.rAntler01.mirror = true;
        this.rAntler01.setRotationPoint(-1.5F, -4.5F, -1.0F);
        this.rAntler01.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler01, -0.08726646259971647F, 0.0F, -0.5235987755982988F);
        this.lAntler09b = new ModelRenderer(this, 70, 25);
        this.lAntler09b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler09b.addBox(-0.3F, -1.5F, -0.4F, 0.8F, 1.5F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler09b, 0.22689280275926282F, 0.0F, -0.17453292519943295F);
        this.rAntler04 = new ModelRenderer(this, 70, 25);
        this.rAntler04.mirror = true;
        this.rAntler04.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.rAntler04.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler04, 0.0F, 0.0F, 0.5759586531581287F);
        this.lowerJaw = new ModelRenderer(this, 107, 14);
        this.lowerJaw.setRotationPoint(0.0F, 0.3F, -5.0F);
        this.lowerJaw.addBox(-1.5F, -1.4F, -5.6F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerJaw, -0.08726646259971647F, 0.0F, 0.0F);
        this.lAntler04 = new ModelRenderer(this, 70, 25);
        this.lAntler04.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.lAntler04.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler04, 0.0F, 0.0F, -0.5759586531581287F);
        this.rAntler05 = new ModelRenderer(this, 70, 25);
        this.rAntler05.mirror = true;
        this.rAntler05.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.rAntler05.addBox(-0.4F, -2.8F, -0.4F, 0.8F, 3.0F, 0.8F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler05, 0.0F, 0.0F, -0.5235987755982988F);
        this.lAntler09 = new ModelRenderer(this, 70, 25);
        this.lAntler09.setRotationPoint(-0.2F, -2.8F, 0.0F);
        this.lAntler09.addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler09, -0.3490658503988659F, 0.0F, -1.1344640137963142F);
        this.lAntler03 = new ModelRenderer(this, 70, 25);
        this.lAntler03.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.lAntler03.addBox(-0.7F, -4.0F, -0.69F, 1.5F, 4.0F, 1.5F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler03, 0.0F, 0.0F, -0.5235987755982988F);
        this.lAntler07b = new ModelHirschgeist.FlameTipModelRenderer(this, 70, 25);
        this.lAntler07b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler07b.addBox(-0.4F, -2.0F, -0.4F, 0.7F, 2.0F, 0.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lAntler07b, 0.0F, 0.0F, -0.5235987755982988F);
        this.rAntler07 = new ModelRenderer(this, 70, 25);
        this.rAntler07.mirror = true;
        this.rAntler07.setRotationPoint(-0.3F, -2.2F, 0.0F);
        this.rAntler07.addBox(-0.5F, -3.0F, -0.5F, 0.9F, 3.0F, 0.9F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rAntler07, -0.2617993877991494F, 0.0F, -0.6981317007977318F);
        this.snout = new ModelRenderer(this, 66, 13);
        this.snout.setRotationPoint(0.0F, -3.94F, -5.0F);
        this.snout.addBox(-1.5F, -1.0F, -6.1F, 3.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(snout, 0.20943951023931953F, 0.0F, 0.0F);
        this.rAntler02.addChild(this.rAntler08);
        this.rAntler07.addChild(this.rAntler07b);
        this.lAntler05.addChild(this.lAntler05b);
        this.lAntler09b.addChild(this.lAntler09c);
        this.rAntler08.addChild(this.rAntler08b);
        this.rAntler04.addChild(this.rAntler06);
        this.rAntler09b.addChild(this.rAntler09c);
        this.head.addChild(this.lAntler01);
        this.head.addChild(this.rUpperJaw);
        this.lAntler01.addChild(this.lAntler02);
        this.rAntler05.addChild(this.rAntler05b);
        this.lAntler03.addChild(this.lAntler07);
        this.lAntler04.addChild(this.lAntler05);
        this.rAntler10.addChild(this.rAntler010b);
        this.head.addChild(this.lUpperJaw);
        this.rAntler01.addChild(this.rAntler02);
        this.rAntler02.addChild(this.rAntler03);
        this.lAntler02.addChild(this.lAntler08);
        this.lAntler08.addChild(this.lAntler08b);
        this.rAntler02.addChild(this.rAntler09);
        this.rAntler09.addChild(this.rAntler09b);
        this.lAntler04.addChild(this.lAntler06);
        this.rAntler02.addChild(this.rAntler10);
        this.lAntler10.addChild(this.lAntler010b);
        this.lAntler02.addChild(this.lAntler10);
        this.head.addChild(this.rAntler01);
        this.lAntler09.addChild(this.lAntler09b);
        this.rAntler03.addChild(this.rAntler04);
        this.head.addChild(this.lowerJaw);
        this.lAntler03.addChild(this.lAntler04);
        this.rAntler04.addChild(this.rAntler05);
        this.lAntler02.addChild(this.lAntler09);
        this.lAntler02.addChild(this.lAntler03);
        this.lAntler07.addChild(this.lAntler07b);
        this.rAntler03.addChild(this.rAntler07);
        this.head.addChild(this.snout);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleY = (float) Math.toRadians(limbSwing);
        this.head.rotateAngleX = (float) Math.toRadians(limbSwingAmount);
        this.head.rotationPointX = 0F;
        this.head.rotationPointZ = 0F;
        if(this.head.rotateAngleX > 0F) {
            this.head.rotationPointY = 17.0F;
        } else {
            this.head.rotationPointY = 23.0F;
            int angle = Math.round(limbSwing);
            if(angle == 0) {
                this.head.rotationPointZ = 4F;
            } else if(angle == 90) {
                this.head.rotationPointX = 4F;
            } else if(angle == 180) {
                this.head.rotationPointZ = -4F;
            } else if(angle == 270) {
                this.head.rotationPointX = -4F;
            }
        }
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
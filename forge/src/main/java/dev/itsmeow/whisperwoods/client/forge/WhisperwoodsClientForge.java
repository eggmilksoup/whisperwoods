package dev.itsmeow.whisperwoods.client.forge;

import dev.itsmeow.whisperwoods.client.init.ClientLifecycleHandler;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class WhisperwoodsClientForge {
    public void clientSetup(FMLClientSetupEvent event) {
        ClientLifecycleHandler.clientInit();
    }
}
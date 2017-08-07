package com.seraphjack.saltfishtweaks;

import com.seraphjack.saltfishtweaks.block.BlockLoader;
import com.seraphjack.saltfishtweaks.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}

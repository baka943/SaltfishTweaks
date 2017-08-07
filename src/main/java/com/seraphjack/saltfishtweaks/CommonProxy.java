package com.seraphjack.saltfishtweaks;

import com.seraphjack.saltfishtweaks.block.BlockLoader;
import com.seraphjack.saltfishtweaks.event.EventLoader;
import com.seraphjack.saltfishtweaks.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        new ItemLoader();
        new BlockLoader();
    }

    public void init(FMLInitializationEvent e) {
        new EventLoader();
        new RecipeLoader();
    }
}

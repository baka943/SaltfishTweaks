package com.seraphjack.saltfishtweaks.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLoader {
    public static ItemSaltyFishBottle itemSaltyFishBottle;

    public ItemLoader() {
        itemSaltyFishBottle = new ItemSaltyFishBottle();
        GameRegistry.register(itemSaltyFishBottle);
    }

    public static void registerRenders() {
        registerRender(itemSaltyFishBottle);
    }

    private static void registerRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}

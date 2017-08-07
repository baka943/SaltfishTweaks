package com.seraphjack.saltfishtweaks;

import com.seraphjack.saltfishtweaks.block.BlockLoader;
import com.seraphjack.saltfishtweaks.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeLoader {
    public RecipeLoader() {
        GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockSaltyFish), "aba", "bcb", "aba", 'b', Blocks.DIAMOND_BLOCK, 'a', Blocks.OBSIDIAN, 'c', ItemLoader.itemSaltyFishBottle);
    }
}

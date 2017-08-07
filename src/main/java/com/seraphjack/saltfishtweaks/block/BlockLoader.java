package com.seraphjack.saltfishtweaks.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.List;

public class BlockLoader {
    public static Block blockSaltyFish;

    public BlockLoader() {
        blockSaltyFish = new BlockSaltyFish();
        register(blockSaltyFish, "salty_fish");
    }

    private static void register(Block block, String name) {
        GameRegistry.register(block.setRegistryName(name));
        GameRegistry.register(new ItemBlock(block) {
            @SideOnly(Side.CLIENT)
            @Override
            public boolean hasEffect(ItemStack stack) {
                return true;
            }

            @SideOnly(Side.CLIENT)
            @Override
            public void addInformation(@Nonnull ItemStack stack,@Nonnull EntityPlayer playerIn,@Nonnull List<String> tooltip, boolean advanced) {
                tooltip.add(I18n.format("tile.block_salty_fish.tooltip"));
            }
        }.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(blockSaltyFish);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block) {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}

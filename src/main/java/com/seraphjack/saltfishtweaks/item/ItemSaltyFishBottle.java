package com.seraphjack.saltfishtweaks.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemSaltyFishBottle extends Item {
    public ItemSaltyFishBottle() {
        setUnlocalizedName("salty_fish_bottle");
        setRegistryName("salty_fish_bottle");
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(16);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(I18n.format("item.salty_fish_bottle.tooltip"));
    }
}

package com.seraphjack.saltfishtweaks.event;

import com.seraphjack.saltfishtweaks.item.ItemLoader;
import net.minecraft.block.BlockSkull;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

public class EventLoader {
    public EventLoader() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerBreakBlock(BlockEvent.BreakEvent e) {
        World world = e.getWorld();
        if (world.isRemote)
            return;
        if (e.isCanceled())
            return;
        if (e.getState().getBlock() instanceof BlockSkull) {
            e.setCanceled(true);
            world.setBlockToAir(e.getPos());
            e.getPlayer().addChatMessage(new TextComponentTranslation(I18n.format("event.saltfishtweaks.chatmsg")));
        }
    }

    @SubscribeEvent
    public void onItemUse(PlayerInteractEvent event) {
        if (event.getWorld().isRemote)
            return;
        if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.AIR
                && event.getItemStack() != null
                && event.getItemStack().getItem().equals(Items.GLASS_BOTTLE)
                && event.getEntityPlayer().dimension == -1) {
            event.getItemStack().stackSize--;
            if (event.getItemStack().stackSize <= 0)
                event.getEntityPlayer().setHeldItem(event.getHand(), null);
            ItemStack stack = new ItemStack(ItemLoader.itemSaltyFishBottle);
            stack.stackSize = 1;
            ItemHandlerHelper.giveItemToPlayer(event.getEntityPlayer(), stack);
        }
    }
}

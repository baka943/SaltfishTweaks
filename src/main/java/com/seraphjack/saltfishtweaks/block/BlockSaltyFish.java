package com.seraphjack.saltfishtweaks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.FakePlayer;

public class BlockSaltyFish extends Block {
    public BlockSaltyFish() {
        super(Material.IRON);
        setUnlocalizedName("block_salty_fish");
        setHardness(50F);
        setSoundType(SoundType.METAL);
        setResistance(12450000F);
        setLightLevel(0.5F);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
        return entity instanceof EntityPlayer && !(entity instanceof FakePlayer);
    }
}

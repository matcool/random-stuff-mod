package com.mateus.Aletorio.blocks;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AlfaceCrops extends BlockCrops {
	
	protected Item getSeed()
    {
        return MItems.alface;
    }

    protected Item getCrop()
    {
        return MItems.alface;
    }
    
    protected Item getDrops()
    {
    	return MItems.alface;
    }

    public AlfaceCrops() {
		setRegistryName(IdDoMod.AletoBlocks.ALFACECROP.getRegistryName());
		setUnlocalizedName(IdDoMod.AletoBlocks.ALFACECROP.getUnlocalizedName());
	}
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    
    public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        if (this.isMaxAge(state) && RANDOM.nextInt(50) == 0)
            ret.add(new ItemStack(MItems.alface, 32));
        return ret;
    }
    
}

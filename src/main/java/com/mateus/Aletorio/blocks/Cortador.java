package com.mateus.Aletorio.blocks;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Cortador extends BlockHorizontal {
	
	public Cortador() {
		super(Material.ANVIL);
		setUnlocalizedName(IdDoMod.AletoBlocks.CORTADOR.getUnlocalizedName());
		setRegistryName(IdDoMod.AletoBlocks.CORTADOR.getRegistryName());
		setCreativeTab(MTabs.tabMateus);
		setHardness(5);
	}
}

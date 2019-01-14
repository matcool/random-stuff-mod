package com.mateus.Aletorio.blocks;

import java.util.List;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;
import com.mateus.Aletorio.tileentity.TileEntityJar;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Lampa extends Block implements ITileEntityProvider{

	private final boolean isOn;
	
	private static final AxisAlignedBB BOUDING_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 10, 0.0625 * 12);
	
	public Lampa(boolean isOn) {
		super(Material.CACTUS);
		setUnlocalizedName(IdDoMod.AletoBlocks.LAMPA.getUnlocalizedName());
		setRegistryName(IdDoMod.AletoBlocks.LAMPA.getRegistryName());
		setCreativeTab(MTabs.tabMateus);
		setHardness(2f);
	}
    @Override
    public boolean isOpaqueCube(IBlockState state) {
	return false;
    }
    @Override
    public boolean isFullCube(IBlockState state) {
    	return false;
    }
    @Override
    public BlockRenderLayer getBlockLayer() {
    	return BlockRenderLayer.TRANSLUCENT;
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
    	return BOUDING_BOX;
    }
    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
    	super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUDING_BOX);
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityJar();
	}
}

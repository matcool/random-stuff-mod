package com.mat.randomstuff.init;

import com.mat.randomstuff.block.*;
import com.mat.randomstuff.block.slicer.BlockSlicer;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockSlicer slicer = new BlockSlicer();
	public static BlockCropLettuce cropLettuce = new BlockCropLettuce();

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				slicer,
				cropLettuce
		);
		GameRegistry.registerTileEntity(slicer.getTileEntityClass(), slicer.getRegistryName().toString());
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				slicer.createItemBlock()
		);
	}

	public static void registerModels() {
		slicer.registerItemModel(Item.getItemFromBlock(slicer));
	}

}
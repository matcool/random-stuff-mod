package com.mat.randomstuff.item;

import com.mat.randomstuff.RandomStuff;
import com.mat.randomstuff.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemLettuceSeeds extends ItemSeeds {

	public ItemLettuceSeeds() {
		super(ModBlocks.cropLettuce, Blocks.FARMLAND);
		setUnlocalizedName("lettuce_seeds");
		setRegistryName("lettuce_seeds");
		
		setCreativeTab(RandomStuff.creativeTab);
	}
	
	public void registerItemModel() {
		RandomStuff.proxy.registerItemRenderer(this, 0, "lettuce_seeds");
	}
}

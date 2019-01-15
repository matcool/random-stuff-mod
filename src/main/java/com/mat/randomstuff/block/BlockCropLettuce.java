package com.mat.randomstuff.block;

import com.mat.randomstuff.RandomStuff;
import com.mat.randomstuff.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropLettuce extends BlockCrops {
	public BlockCropLettuce() {
		setUnlocalizedName("crop_lettuce");
		setRegistryName("crop_lettuce");
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.lettuceSeeds;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.lettuce;
	}
}

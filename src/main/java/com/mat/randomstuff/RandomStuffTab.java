package com.mat.randomstuff;

import com.mat.randomstuff.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RandomStuffTab extends CreativeTabs {

	public RandomStuffTab() {
		super(RandomStuff.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.lettuce);
	}

}

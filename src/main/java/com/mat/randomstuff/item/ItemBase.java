package com.mat.randomstuff.item;

import com.mat.randomstuff.RandomStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(RandomStuff.creativeTab);
	}
	
	public void registerItemModel() {
		RandomStuff.proxy.registerItemRenderer(this, 0, name);
	}
}

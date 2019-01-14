package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Hamburguer extends ItemFood {
	
	public Hamburguer() {
		super(20, 8, false);
		setUnlocalizedName(IdDoMod.AletoItems.BURGER.getUnlocalizedName());
		setRegistryName(IdDoMod.AletoItems.BURGER.getRegistryName());
		setCreativeTab(MTabs.tabMateus);
	}

}

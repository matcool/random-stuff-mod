package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;

public class Queijo extends Item {
	
	public Queijo() {
		setUnlocalizedName(IdDoMod.AletoItems.TAISSA.getUnlocalizedName());
		setRegistryName(IdDoMod.AletoItems.TAISSA.getRegistryName());
		setCreativeTab(MTabs.tabMateus);
	}

}

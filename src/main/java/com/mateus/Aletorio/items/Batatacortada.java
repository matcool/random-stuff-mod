package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;

public class Batatacortada extends Item {
	
	public Batatacortada() {
		setUnlocalizedName(IdDoMod.AletoItems.BATATACORTADA.getUnlocalizedName());
		setRegistryName(IdDoMod.AletoItems.BATATACORTADA.getRegistryName());
		setCreativeTab(MTabs.tabMateus);
	}

}

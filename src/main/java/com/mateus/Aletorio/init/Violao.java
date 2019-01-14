package com.mateus.Aletorio.init;

import com.mateus.Aletorio.IdDoMod;

import net.minecraft.item.Item;

public class Violao extends Item {
	
	public Violao(){
		setRegistryName(IdDoMod.AletoItems.VIOLAO.getRegistryName());
		setUnlocalizedName(IdDoMod.AletoItems.VIOLAO.getUnlocalizedName());
		setCreativeTab(MTabs.tabMateus);
	}

}

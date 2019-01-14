package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Batata_frita extends ItemFood {

		public Batata_frita() {
		super(10, 8, false);
		setRegistryName(IdDoMod.AletoItems.BATATAFRITE.getRegistryName());
		setUnlocalizedName(IdDoMod.AletoItems.BATATAFRITE.getUnlocalizedName());
		setCreativeTab(MTabs.tabMateus);
	}
}

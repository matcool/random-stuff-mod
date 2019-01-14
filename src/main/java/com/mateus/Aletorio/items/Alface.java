package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;

public class Alface extends Item {
	
		public Alface() {
			setRegistryName(IdDoMod.AletoItems.ALFACE.getRegistryName());
			setUnlocalizedName(IdDoMod.AletoItems.ALFACE.getUnlocalizedName());
			setCreativeTab(MTabs.tabMateus);
		}

}

package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;

public class Saco extends Item {
			public Saco() {
				setUnlocalizedName(IdDoMod.AletoItems.SACO.getUnlocalizedName());
				setRegistryName(IdDoMod.AletoItems.SACO.getRegistryName());
				setCreativeTab(MTabs.tabMateus);
			}
}

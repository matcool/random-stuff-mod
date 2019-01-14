package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;

public class Paper_red extends Item {
			public Paper_red() {
				setUnlocalizedName(IdDoMod.AletoItems.PAPER_RED.getUnlocalizedName());
				setRegistryName(IdDoMod.AletoItems.PAPER_RED.getRegistryName());
				setCreativeTab(MTabs.tabMateus);
			}
}

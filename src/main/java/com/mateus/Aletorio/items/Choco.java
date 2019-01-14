package com.mateus.Aletorio.items;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.init.MTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Choco extends ItemFood {
				public Choco() {
					super(6, 8, false);
					setUnlocalizedName(IdDoMod.AletoItems.CHOCO.getUnlocalizedName());
					setRegistryName(IdDoMod.AletoItems.CHOCO.getRegistryName());
					setCreativeTab(MTabs.tabMateus);
				}
}

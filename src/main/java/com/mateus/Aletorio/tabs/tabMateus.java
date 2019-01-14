package com.mateus.Aletorio.tabs;

import com.mateus.Aletorio.init.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabMateus extends CreativeTabs {

	public tabMateus(String n) {
		super(n);
	}

	public Item getTabIconItem() {
		return MItems.batatafrita;
	}

}

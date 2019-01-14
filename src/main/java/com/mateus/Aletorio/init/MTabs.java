package com.mateus.Aletorio.init;

import net.minecraft.creativetab.CreativeTabs;

public class MTabs {
	
	public static CreativeTabs tabMateus;
	
	public static final void preInit() {
		tabMateus = new com.mateus.Aletorio.tabs.tabMateus("tabMateus");
	}
}

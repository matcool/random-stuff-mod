package com.mat.randomstuff.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase choppedPotato = new ItemBase("chopped_potato");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			choppedPotato
		);
	}
	
	public static void registerModels() {
		choppedPotato.registerItemModel();
	}

}
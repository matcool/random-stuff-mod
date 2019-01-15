package com.mat.randomstuff.init;

import com.mat.randomstuff.item.ItemBase;
import com.mat.randomstuff.item.ItemLettuceSeeds;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase choppedPotato = new ItemBase("chopped_potato");
	public static ItemLettuceSeeds lettuceSeeds = new ItemLettuceSeeds();
	public static ItemBase lettuce = new ItemBase("lettuce");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			choppedPotato,
			lettuceSeeds,
			lettuce
		);
	}
	
	public static void registerModels() {
		choppedPotato.registerItemModel();
		lettuceSeeds.registerItemModel();
		lettuce.registerItemModel();
	}

}
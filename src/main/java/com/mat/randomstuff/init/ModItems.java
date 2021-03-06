package com.mat.randomstuff.init;

import com.mat.randomstuff.RandomStuff;
import com.mat.randomstuff.item.ItemBase;
import com.mat.randomstuff.item.ItemLettuceSeeds;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase choppedPotato = new ItemBase("chopped_potato");
	public static ItemBase fries = new ItemBase("fries");
	public static ItemBase redPaper = new ItemBase("red_paper");
	public static ItemBase holder = new ItemBase("holder");
	public static ItemBase fancyFries = new ItemBase("fancy_fries");
	public static ItemBase cheese = new ItemBase("cheese");
	public static ItemBase chocolate = new ItemBase("chocolate");
	public static ItemBase hamburger = new ItemBase("hamburger");
	
	public static ItemLettuceSeeds lettuceSeeds = new ItemLettuceSeeds();
	public static ItemBase lettuce = new ItemBase("lettuce");
	
	public static Object[] Items = {
			choppedPotato,
			lettuceSeeds,
			lettuce,
			fries,
			redPaper,
			holder,
			fancyFries,
			cheese,
			chocolate,
			hamburger,
	};

	public static void register(IForgeRegistry<Item> registry) {
		for (Object item : Items) {
			registry.register((Item) item);
		}
	}
	
	public static void registerModels() {
		//TODO figure out a way that doesn't require a bunch of if statements
		for (Object item : Items) {
			if (item instanceof ItemBase) {
				((ItemBase) item).registerItemModel();
			}
			if (item instanceof ItemLettuceSeeds) {
				((ItemLettuceSeeds) item).registerItemModel();
			}
		}
	}

}
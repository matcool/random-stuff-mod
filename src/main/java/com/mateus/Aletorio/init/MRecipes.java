package com.mateus.Aletorio.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class MRecipes {
	
     
	public static final void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MBlocks.lampa, 1), new Object[]{
			" x ",
			"xyx",
			" x ",
			Character.valueOf('x'), Blocks.STAINED_GLASS,
			Character.valueOf('y'), Blocks.GLOWSTONE
		}));
		GameRegistry.addRecipe(new ItemStack(MItems.burger, 1), new Object[]{
			"x  ",
			"yza",
			"  x",
			Character.valueOf('x'), Items.BREAD,
			Character.valueOf('y'), Items.COOKED_BEEF,
			Character.valueOf('z'), MItems.taissa,
			Character.valueOf('a'), MItems.alface
		});
		GameRegistry.addSmelting(new ItemStack(MItems.batatacortada, 1), new ItemStack(MItems.batatactosted, 1), 6f);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MItems.batatacortada, 1), new Object[]{
			"   ",
			" x ",
			"   ",
			Character.valueOf('x'), Items.POTATO
		}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MItems.paper_red, 8), new Object[]{
			"xxx",
			"xyx",
			"xxx",
			Character.valueOf('y'), Items.PAPER,
			Character.valueOf('x'), new ItemStack(Items.DYE, 2, 1)
		}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MBlocks.alfacecrop, 2), new ItemStack(MItems.alface)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MItems.batatafrita), new Object[]{
			"   ", 
			" x ", 
			" y ", 
			Character.valueOf('x'), MItems.batatactosted, 
			Character.valueOf('y'), MItems.saco
		}));
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 4), new ItemStack(MItems.choco), 10f);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MItems.saco, 3), new Object[]{
			"   ",
			"x x",
			" x ",
			Character.valueOf('x'), MItems.paper_red
		}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MItems.taissa, 2), new ItemStack(Items.SUGAR)));
	}
}

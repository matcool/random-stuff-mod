package com.mateus.Aletorio.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mateus.Aletorio.blocks.AlfaceCrops;
import com.mateus.Aletorio.blocks.Cortador;
import com.mateus.Aletorio.blocks.Lampa;



public class MBlocks {
	
	public static Block lampa;
	public static Block alfacecrop;
	public static Block cortador;
	
	public static void init() {
		cortador = new Cortador();
		lampa = new Lampa().setLightLevel(1.0f);
		alfacecrop = new AlfaceCrops();
	}
	
	public static void register(){
		registerBlock(cortador);
		registerBlock(lampa);
		registerBlock(alfacecrop);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders(){
		registerRender(cortador);
		registerRender(lampa);
		registerRender(alfacecrop);
	}
	
	public static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}

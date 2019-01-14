package com.mateus.Aletorio.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mateus.Aletorio.IdDoMod;
import com.mateus.Aletorio.items.Batatacortada;
import com.mateus.Aletorio.items.Batatactosted;
import com.mateus.Aletorio.items.Choco;
import com.mateus.Aletorio.items.Paper_red;
import com.mateus.Aletorio.items.Saco;
import com.mateus.Aletorio.items.Alface;
import com.mateus.Aletorio.items.Batata_frita;
import com.mateus.Aletorio.items.Hamburguer;
import com.mateus.Aletorio.items.Queijo;

public class MItems {
	
	public static Item batatacortada;
	public static Item batatactosted;
	public static Item paper_red;
	public static Item saco;
	public static ItemFood choco;
	public static Item alface;
	public static ItemFood batatafrita;
	public static Item taissa;
	public static ItemFood burger;
	public static Item violao;
	public static void init(){
		batatacortada = new Batatacortada();
		batatactosted = new Batatactosted();
		paper_red = new Paper_red();
		saco = new Saco();
		choco = new Choco();
		alface = new Alface();
		batatafrita = new Batata_frita();
		taissa = new Queijo();
		burger = new Hamburguer();
		violao = new Violao();
	}
	public static void register(){
		GameRegistry.register(batatacortada);
		GameRegistry.register(batatactosted);
		GameRegistry.register(paper_red);
		GameRegistry.register(saco);
		GameRegistry.register(choco);
		GameRegistry.register(alface);
		GameRegistry.register(batatafrita);
		GameRegistry.register(taissa);
		GameRegistry.register(burger);
		GameRegistry.register(violao);
	}
	public static void registerRenders(){
		registerRender(batatacortada);
		registerRender(batatactosted);
		registerRender(paper_red);
		registerRender(saco);
		registerRender(choco);
		registerRender(alface);
		registerRender(batatafrita);
		registerRender(taissa);
		registerRender(burger);
		registerRender(violao);
	}
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

package com.mateus.Aletorio;

import scala.reflect.internal.Trees.This;

import com.mateus.Aletorio.init.MBlocks;
import com.mateus.Aletorio.init.MItems;
import com.mateus.Aletorio.init.MRecipes;
import com.mateus.Aletorio.init.MTabs;
import com.mateus.Aletorio.proxy.CommonProxy;
import com.mateus.Aletorio.tileentity.TileEntityJar;
import com.mojang.authlib.GameProfile;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = IdDoMod.MOD_ID, name = IdDoMod.NAME, version = IdDoMod.VERSION, acceptedMinecraftVersions = IdDoMod.ACCEPTED_VERSIONS)
public class MainClass {

	@Instance
	public static MainClass instance;
	
	@SidedProxy(clientSide = IdDoMod.CLIENT_PROXY_CLASS, serverSide = IdDoMod.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MTabs.preInit();
		MItems.init();
		MItems.register();
		
		MBlocks.init();
		MBlocks.register();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		
		MRecipes.init();
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("a");
	}
}


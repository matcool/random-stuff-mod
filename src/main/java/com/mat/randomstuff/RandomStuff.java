package com.mat.randomstuff;

import com.mat.randomstuff.init.*;
import com.mat.randomstuff.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = RandomStuff.MODID, name = RandomStuff.NAME, version = RandomStuff.VERSION)
public class RandomStuff
{
    public static final String MODID = "randomstuff";
    public static final String NAME = "Terrible mod";
    public static final String VERSION = "1.0rw";
    
    @Mod.Instance
    public static RandomStuff instance;
    
    @SidedProxy(serverSide = "com.mat.randomstuff.proxy.CommonProxy", clientSide = "com.mat.randomstuff.proxy.ClientProxy")
    public static CommonProxy proxy;
    
    public static final RandomStuffTab creativeTab = new RandomStuffTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {
    }
    
    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
    	@SubscribeEvent
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		ModItems.register(event.getRegistry());
    		ModBlocks.registerItemBlocks(event.getRegistry());
    	}
    	
    	@SubscribeEvent
    	public static void registerModels(ModelRegistryEvent event) {
    		ModItems.registerModels();
    		ModBlocks.registerModels();
    	}
    	
    	@SubscribeEvent
    	public static void registerBlocks(RegistryEvent.Register<Block> event) {
    		ModBlocks.register(event.getRegistry());
    	}
	}
}

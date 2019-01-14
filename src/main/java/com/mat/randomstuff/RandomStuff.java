package com.mat.randomstuff;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RandomStuff.MODID, name = RandomStuff.NAME, version = RandomStuff.VERSION)
public class RandomStuff
{
    public static final String MODID = "randomstuff";
    public static final String NAME = "Terrible mod";
    public static final String VERSION = "1.0rw";
    
    @Mod.Instance
    public static RandomStuff instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {
    }
}

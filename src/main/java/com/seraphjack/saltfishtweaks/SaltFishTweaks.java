package com.seraphjack.saltfishtweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SaltFishTweaks.MODID, version = SaltFishTweaks.VERSION, name = SaltFishTweaks.NAME)
public class SaltFishTweaks {
    public static final String MODID = "saltfishtweaks";
    public static final String VERSION = "1.2.6";
    public static final String NAME = "SaltFishTweaks";

    @Mod.Instance(SaltFishTweaks.MODID)
    public static SaltFishTweaks instance;

    @SidedProxy(serverSide = "com.seraphjack.saltfishtweaks.CommonProxy", clientSide = "com.seraphjack.saltfishtweaks.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
}

package com.tygrewolf.randomtp;

import com.tygrewolf.randomtp.init.ModItems;
import com.tygrewolf.randomtp.proxy.ICommonProxy;
import com.tygrewolf.randomtp.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RandomTP {

    @Mod.Instance(Reference.MOD_ID)
    public static RandomTP instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static ICommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        ModItems.init();
        ModItems.register();
//        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
//        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
//        ModItems.init();
//        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}

package com.tygrewolf.randomtp.configuration;

import com.tygrewolf.randomtp.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by TygreWolf on 4/19/2016.
 */
public class RTPConfiguration {

    private static Configuration config = null;

    public static Configuration getConfig()
    {
        return config;
    }

    public static void preInit()
    {

    }

    public static void init()
    {

    }

    public static void postInit()
    {

    }

    public static void syncFromFile()
    {
        syncConfig(true, true);
    }

    public static void syncFromGUI()
    {
        syncConfig(false, true);
    }

    public static void syncFromFields()
    {
        syncConfig(false, false);
    }

    private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
    {

    }

    /*
     * This class, when instantiated as an object, will listen on the FML
     * event bus for an OnConfigChangedEvent.  Used when a user changes
     * the configuration from the Client GUI.
     */
    public static class ConfigEventHandler
    {
        @SubscribeEvent(priority = EventPriority.NORMAL)
        public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event)
        {
            if (event.getModID().equalsIgnoreCase(Reference.MOD_ID) && !event.isWorldRunning())
            {
                if (event.getConfigID().equalsIgnoreCase(Reference.CATEGORY_NAME_GENERAL) || event.getConfigID().equalsIgnoreCase(Reference.CATEGORY_NAME_OTHER))
                {
                    syncFromGUI();
                }
            }
        }
    }
}

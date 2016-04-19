package com.tygrewolf.randomtp.proxy;

/**
 * Created by TygreWolf on 4/19/2016.
 */
public class CommonProxy implements IProxy {

    public void preInit()
    {
        // Read/Startup configuration first
        //example.RTPConfiguration.StartupCommon.preInitCommon();

        // Pre-Init everything else
        //example.Items.StartupCommon.preInitCommon();
        //example.Blocks.StartupCommon.preInitCommon();
        //example.Commands.StartupCommon.preInitCommon();
        //example.Recipes.StartupCommon.preInitCommon();
        //example.CreativeTab.StartupCommon.preInitCommon();
        //example.TestingFramework.StartupCommon.preInitCommon();


    }

    public void init()
    {
        // RTPConfiguration is first again
        //example.RTPConfiguration.StartupCommon.initCommon();

        // Init everything else
        //example.Items.StartupCommon.initCommon();
        //example.Blocks.StartupCommon.initCommon();
        //example.Commands.StartupCommon.initCommon();
        //example.Recipes.StartupCommon.initCommon();
        //example.CreativeTab.StartupCommon.initCommon();
        //example.TestingFramework.StartupCommon.initCommon();
    }

    public void postInit()
    {
        //Same as above, except StartupCommon.postInitCommon();
    }
}

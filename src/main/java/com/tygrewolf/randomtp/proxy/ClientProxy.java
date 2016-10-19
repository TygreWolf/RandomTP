package com.tygrewolf.randomtp.proxy;

import com.tygrewolf.randomtp.init.ModItems;

public class ClientProxy implements ICommonProxy {

    @Override
    public void preInit() {

    }

    @Override
    public void init() {
        ModItems.registerRenders();
    }

    @Override
    public void postInit() {

    }
}

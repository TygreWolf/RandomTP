package com.tygrewolf.randomtp.init;

import com.tygrewolf.randomtp.items.MyItem;
import com.tygrewolf.randomtp.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    private static Item myItem;

    public static void init()
    {
        myItem = new MyItem();
        //GameRegistry.registerItem(myItem, "myItem");
    }

    public static void register() {
        GameRegistry.register(myItem);
    }

    public static void registerRenders() {
        registerRender(myItem);
    }

    private static void registerRender(Item item){
        // Old way of doing it
        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

        // New way of doing it
        // TODO: registerRenders may need called during preInit.  Have to test.
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}

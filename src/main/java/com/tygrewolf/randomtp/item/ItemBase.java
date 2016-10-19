package com.tygrewolf.randomtp.item;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import com.tygrewolf.randomtp.creativetab.CreativeTabRandomTP;
import com.tygrewolf.randomtp.reference.Reference;
//import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBase extends Item {

    public ItemBase()
    {
        super();
        this.setCreativeTab(CreativeTabRandomTP.RANDOMTP_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return getUnlocalizedName();
    }

/*    //TODO: Fix icon registration
    //@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconCreator iconCreator)
    {

        //itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }*/

    private String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static void setItemName(Item item, String itemName) {
        item.setRegistryName(itemName);
        item.setUnlocalizedName(item.getRegistryName().toString());
    }

}

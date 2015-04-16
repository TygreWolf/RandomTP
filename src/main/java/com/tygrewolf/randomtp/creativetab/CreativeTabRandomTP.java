package com.tygrewolf.randomtp.creativetab;

import com.tygrewolf.randomtp.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRandomTP
{
    public static final CreativeTabs RANDOMTP_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}

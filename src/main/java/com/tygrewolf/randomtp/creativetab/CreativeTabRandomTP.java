package com.tygrewolf.randomtp.creativetab;

import akka.dispatch.sysmsg.Create;
import com.tygrewolf.randomtp.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by TygreWolf on 4/19/2016.
 */
public class CreativeTabRandomTP {

    public static final CreativeTabs RANDOMTP_TAB = new CreativeTabs(Reference.LOWERCASE_MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
}

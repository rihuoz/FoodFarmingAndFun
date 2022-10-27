package com.zouhair.foodfarmingandfun.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FFAFCreativeTab {

    public static final CreativeModeTab FFAF_TAB = new CreativeModeTab("FFAFTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FFAFItems.RAW_GEM.get());
        }
    };
}

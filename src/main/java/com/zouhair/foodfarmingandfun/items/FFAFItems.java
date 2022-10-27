package com.zouhair.foodfarmingandfun.items;


import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFAFItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodFarmingAndFun.MOD_ID);

    public static final RegistryObject<Item> GEM_CLUSTER = ITEMS.register("gem_cluster",
            () -> new Item(new Item.Properties()
                    .tab(FFAFCreativeTab.FFAF_TAB)
            ));

    public static final RegistryObject<Item> RAW_GEM = ITEMS.register("raw_gem",
            () -> new Item(new Item.Properties()
                    .tab(FFAFCreativeTab.FFAF_TAB)
            ));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

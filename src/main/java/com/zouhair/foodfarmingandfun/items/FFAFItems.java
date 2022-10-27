package com.zouhair.foodfarmingandfun.items;


import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import com.zouhair.foodfarmingandfun.items.custom.EndGameFoodItem;
import net.minecraft.world.food.FoodProperties;
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

    public static final RegistryObject<Item> END_GAME_FOOD_ITEM = ITEMS.register("end_game_food_item",
            () -> new EndGameFoodItem(new Item.Properties()
                    .food((new FoodProperties.Builder())
                            .nutrition(8)
                            .saturationMod(0.8f)
                            .build())
                    .stacksTo(1)
                    .tab(FFAFCreativeTab.FFAF_TAB)
                    ));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

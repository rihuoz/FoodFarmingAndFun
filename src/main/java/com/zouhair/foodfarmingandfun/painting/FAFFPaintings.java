package com.zouhair.foodfarmingandfun.painting;

import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FAFFPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANT =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FoodFarmingAndFun.MOD_ID);

    public static final RegistryObject<PaintingVariant> SUN_SET = PAINTING_VARIANT.register("sunset",
            () -> new PaintingVariant(16, 16));
    public static void register(IEventBus eventBus){
        PAINTING_VARIANT.register(eventBus);
    }
}

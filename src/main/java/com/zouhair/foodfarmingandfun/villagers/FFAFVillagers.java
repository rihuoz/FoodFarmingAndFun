package com.zouhair.foodfarmingandfun.villagers;

import com.google.common.collect.ImmutableSet;
import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import com.zouhair.foodfarmingandfun.blocks.FFAFBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class FFAFVillagers {
    public static final DeferredRegister<PoiType> POI_TYPE =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, FoodFarmingAndFun.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSION =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, FoodFarmingAndFun.MOD_ID);

    public static final RegistryObject<PoiType> REGENERATION_BLOCK_POI =
            POI_TYPE.register("regeneration_block_poi",
                    ()-> new PoiType(ImmutableSet.copyOf(FFAFBlocks.REGENERATION_BLOCK.get()
                            .getStateDefinition()
                            .getPossibleStates()
                    ), 1, 1));

    public static final RegistryObject<VillagerProfession> HEALER_VILLAGER =
            VILLAGER_PROFESSION.register("healer_villager",
                    ()-> new VillagerProfession("healer_villager",
                            x -> x.get() == REGENERATION_BLOCK_POI.get(),
                            x -> x.get() == REGENERATION_BLOCK_POI.get(),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            SoundEvents.VILLAGER_WORK_CLERIC));
    public static void registerPOIs(){
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class)
                    .invoke(null, REGENERATION_BLOCK_POI.get());
        }catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus){
        POI_TYPE.register(eventBus);
        VILLAGER_PROFESSION.register(eventBus);
    }
}

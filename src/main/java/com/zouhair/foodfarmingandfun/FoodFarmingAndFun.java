package com.zouhair.foodfarmingandfun;


import com.mojang.logging.LogUtils;
import com.zouhair.foodfarmingandfun.blocks.FFAFBlocks;
import com.zouhair.foodfarmingandfun.items.FFAFItems;
import com.zouhair.foodfarmingandfun.villagers.FFAFVillagers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.zouhair.foodfarmingandfun.blocks.custom.SetRenderLayerForCustomBlocks.setRenderLayerForCropBlocks;
import static com.zouhair.foodfarmingandfun.blocks.custom.SetRenderLayerForCustomBlocks.setRenderLayerForTranslucentBlocks;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(com.zouhair.foodfarmingandfun.FoodFarmingAndFun.MOD_ID)
public class FoodFarmingAndFun
{
    public static final String MOD_ID = "foodfarmingandfun";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FoodFarmingAndFun()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FFAFItems.register(modEventBus);
        FFAFBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            FFAFVillagers.registerPOIs();
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            setRenderLayerForTranslucentBlocks();
            setRenderLayerForCropBlocks();
        }
    }
}

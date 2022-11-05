package com.zouhair.foodfarmingandfun.event;

import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import com.zouhair.foodfarmingandfun.items.FFAFItems;
import com.zouhair.foodfarmingandfun.villagers.FFAFVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = FoodFarmingAndFun.MOD_ID)
public class FFAFEvents {

    @SubscribeEvent
    public static void addCustomVillagerTrades(VillagerTradesEvent event){
        if(event.getType() == FFAFVillagers.HEALER_VILLAGER.get()){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack itemStack = new ItemStack(FFAFItems.END_GAME_FOOD_ITEM.get(),1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 64),
                    itemStack,1,32,0.02F));
        }
    }
}
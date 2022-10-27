package com.zouhair.foodfarmingandfun.blocks;

import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import com.zouhair.foodfarmingandfun.blocks.custom.RegenrataionBlock;
import com.zouhair.foodfarmingandfun.items.FFAFCreativeTab;
import com.zouhair.foodfarmingandfun.items.FFAFItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFAFBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodFarmingAndFun.MOD_ID);

    public static final RegistryObject<Block> RAW_GEM_BLOCK = registerBlock("raw_gem_block",
            () -> new Block(
                    BlockBehaviour.Properties.of(Material.AMETHYST)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.AMETHYST)
                            .strength(1.7f)
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> GEM_ORE = registerBlock("gem_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0f)
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> DEEP_SLATE_GEM_ORE = registerBlock("deep_slate_gem_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(4.4f)
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> REGENERATION_BLOCK = registerBlock("regeneration_block",
            () -> new RegenrataionBlock(
                    BlockBehaviour.Properties.of(Material.MOSS)
                            .requiresCorrectToolForDrops()
                            .strength(8.0f)
                    ), FFAFCreativeTab.FFAF_TAB);



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return FFAFItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}

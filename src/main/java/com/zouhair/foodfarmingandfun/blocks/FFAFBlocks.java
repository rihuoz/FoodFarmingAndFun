package com.zouhair.foodfarmingandfun.blocks;

import com.zouhair.foodfarmingandfun.FoodFarmingAndFun;
import com.zouhair.foodfarmingandfun.blocks.custom.GlassLamps;
import com.zouhair.foodfarmingandfun.blocks.custom.RegenerationBlock;
import com.zouhair.foodfarmingandfun.items.FFAFCreativeTab;
import com.zouhair.foodfarmingandfun.items.FFAFItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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
            () -> new RegenerationBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(12.0f)
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> GLASS_LAMP = registerBlock("glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_LAMP = registerBlock("black_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_LAMP = registerBlock("blue_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_LAMP = registerBlock("cyan_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_LAMP = registerBlock("gray_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_LAMP = registerBlock("green_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_LAMP = registerBlock("light_blue_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_LAMP = registerBlock("light_gray_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> LIME_STAINED_GLASS_LAMP = registerBlock("lime_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_LAMP = registerBlock("magenta_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_LAMP = registerBlock("orange_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> PINK_STAINED_GLASS_LAMP = registerBlock("pink_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> PURPLE_GLASS_LAMP = registerBlock("purple_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> RED_GLASS_LAMP = registerBlock("red_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> WHITE_GLASS_LAMP = registerBlock("white_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
                    ), FFAFCreativeTab.FFAF_TAB);

    public static final RegistryObject<Block> YELLOW_GLASS_LAMP = registerBlock("yellow_stained_glass_lamp",
            () -> new GlassLamps(
                    BlockBehaviour.Properties.copy(Blocks.GLASS)
                            .requiresCorrectToolForDrops()
                            .lightLevel(state -> state.getValue(GlassLamps.LIT) ? 15 : 2)
                            .instabreak()
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

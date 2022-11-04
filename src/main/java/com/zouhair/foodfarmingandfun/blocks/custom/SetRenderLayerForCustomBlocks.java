package com.zouhair.foodfarmingandfun.blocks.custom;

import com.zouhair.foodfarmingandfun.blocks.FFAFBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public abstract class SetRenderLayerForCustomBlocks {
    public static void setRenderLayerForTranslucentBlocks(){
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.BLACK_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.BLUE_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.CYAN_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.GREEN_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.GRAY_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.LIGHT_BLUE_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.LIGHT_GRAY_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.LIME_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.MAGENTA_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.ORANGE_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.PINK_STAINED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.PURPLE_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.RED_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.WHITE_GLASS_LAMP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FFAFBlocks.YELLOW_GLASS_LAMP.get(), RenderType.translucent());
    }

    public static void setRenderLayerForCropBlocks() {

    }
}

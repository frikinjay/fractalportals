package com.frikinjay.fractalportals.init;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static com.frikinjay.fractalportals.common.registry.ModBlocks.ENDER_FRAME;
import static com.frikinjay.fractalportals.common.registry.ModPortalBlocks.END_FRACTAL;

public class PortalsInit {

    public static void registerPortals()
    {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.CRYING_OBSIDIAN)
                .destDimID(new Identifier("the_nether"))
                .tintColor(131,66,184)
                .flatPortal()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .customPortalBlock(END_FRACTAL)
                .frameBlock(ENDER_FRAME)
                .lightWithItem(Items.DRAGON_BREATH)
                .destDimID(new Identifier("the_end"))
                .registerPortal();
    }

}

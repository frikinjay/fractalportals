package com.frikinjay.fractalportals.common.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.frikinjay.fractalportals.common.registry.ModBlocks.ENDER_FRAME;

public class ModItems {

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("fractalportals", "ender_frame"), new BlockItem(ENDER_FRAME, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}

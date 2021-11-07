package com.frikinjay.fractalportals.common.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block ENDER_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(3.0F, 9.0F));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier("fractalportals", "ender_frame"), ENDER_FRAME);
    }

}

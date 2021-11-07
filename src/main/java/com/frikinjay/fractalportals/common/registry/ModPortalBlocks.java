package com.frikinjay.fractalportals.common.registry;

import com.frikinjay.fractalportals.FractalPortalsMod;
import com.frikinjay.fractalportals.common.blocks.EndFractalBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPortalBlocks extends CustomPortalBlock {

	public static EndFractalBlock END_FRACTAL = register("end_fractal", new EndFractalBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).noCollision().hardness(-1).luminance((state) -> 15)));

	public ModPortalBlocks(Settings settings) {
		super(settings);
	}

	private static <T extends Block> T register(String name, T block) {
		Registry.register(Registry.BLOCK, new Identifier(FractalPortalsMod.MOD_ID, name), block);
		return block;
	}

}

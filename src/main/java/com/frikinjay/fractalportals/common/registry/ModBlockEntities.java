package com.frikinjay.fractalportals.common.registry;

import com.frikinjay.fractalportals.FractalPortalsMod;
import com.frikinjay.fractalportals.common.entities.EndFractalBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

	public static BlockEntityType<EndFractalBlockEntity> END_FRACTAL;

	public static void init() {
		END_FRACTAL = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(FractalPortalsMod.MOD_ID, "end_fractal"), FabricBlockEntityTypeBuilder.create(EndFractalBlockEntity::new, ModPortalBlocks.END_FRACTAL).build());
	}

}

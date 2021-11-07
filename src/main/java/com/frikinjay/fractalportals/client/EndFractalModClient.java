package com.frikinjay.fractalportals.client;

import com.frikinjay.fractalportals.client.renderer.EndFractalBlockEntityRenderer;
import com.frikinjay.fractalportals.common.registry.ModBlockEntities;
import com.frikinjay.fractalportals.common.registry.ModPortalBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class EndFractalModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModPortalBlocks.END_FRACTAL);
		BlockEntityRendererRegistry.INSTANCE.register(ModBlockEntities.END_FRACTAL, EndFractalBlockEntityRenderer::new);
	}

}

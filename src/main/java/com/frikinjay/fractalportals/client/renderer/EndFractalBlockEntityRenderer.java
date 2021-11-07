package com.frikinjay.fractalportals.client.renderer;

import com.frikinjay.fractalportals.common.entities.EndFractalBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory.Context;
import net.minecraft.client.render.block.entity.EndPortalBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;

public class EndFractalBlockEntityRenderer extends EndPortalBlockEntityRenderer<EndFractalBlockEntity> {

	public EndFractalBlockEntityRenderer(Context ctx) {
		super(ctx);
	}

	public void render(EndFractalBlockEntity endGatewayBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
		super.render(endGatewayBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
	}

	protected float getTopYOffset() {
		return 1.0F;
	}

	protected float getBottomYOffset() {
		return 0.0F;
	}

	protected RenderLayer getLayer() {
		return RenderLayer.getEndGateway();
	}

	public int getRenderDistance() {
		return 256;
	}

}

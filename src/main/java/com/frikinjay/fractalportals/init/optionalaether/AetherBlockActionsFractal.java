package com.frikinjay.fractalportals.init.optionalaether;

import net.id.aether.util.RenderUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import static net.id.incubus_core.util.RegistryQueue.Action;
import static net.id.incubus_core.util.RegistryQueue.onClient;

class AetherBlockActionsFractal {
    protected static final AbstractBlock.ContextPredicate never = (state, view, pos) -> false;
    protected static final Action<Block> translucentRenderLayer = onClient((id, block) -> RenderUtils.transparentRenderLayer(block));
}

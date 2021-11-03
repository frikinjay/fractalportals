package com.frikinjay.fractalportals.init.optionalaether;

import net.id.incubus_core.util.RegistryQueue;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;

import static com.frikinjay.fractalportals.init.optionalaether.AetherBlockActionsFractal.never;
import static com.frikinjay.fractalportals.init.optionalaether.AetherBlockActionsFractal.translucentRenderLayer;
import static net.id.aether.Aether.locate;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.NETHER_PORTAL;

public class AetherPortalBlue {
    public static final AetherPortalBlockFractal BLUE_PORTAL_FRACTAL = add("blue_portal_fractal", new AetherPortalBlockFractal(copy(NETHER_PORTAL).nonOpaque().blockVision(never).mapColor(MapColor.BLUE)), translucentRenderLayer);

    @SafeVarargs
    private static <V extends Block> V add(String id, V block, RegistryQueue.Action<? super V>... additionalActions) {
        return AetherRegistryQueuesFractal.BLOCK.add(locate(id), block, additionalActions);
    }

    public static void init() {
        AetherRegistryQueuesFractal.BLOCK.register();
    }

}

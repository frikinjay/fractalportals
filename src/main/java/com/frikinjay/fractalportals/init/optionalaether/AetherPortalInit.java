package com.frikinjay.fractalportals.init.optionalaether;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

import static com.frikinjay.fractalportals.init.optionalaether.AetherPortalBlue.BLUE_PORTAL_FRACTAL;

public class AetherPortalInit {

    public static void registerAetherPortal()
    {


        CustomPortalBuilder.beginPortal()
                .customPortalBlock(BLUE_PORTAL_FRACTAL)
                .frameBlock(Blocks.SHROOMLIGHT)
                .lightWithWater()
                .destDimID(new Identifier("the_aether:the_aether"))
                .flatPortal()
                .registerPortal();
    }

}

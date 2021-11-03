package com.frikinjay.fractalportals.init;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class PortalsInit {

    public static void registerPortals()
    {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.CRYING_OBSIDIAN)
                .destDimID(new Identifier("the_nether"))
                .tintColor(131,66,184)
                .flatPortal()
                .registerPortal();
    }

}

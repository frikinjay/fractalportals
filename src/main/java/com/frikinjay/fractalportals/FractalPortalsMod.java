package com.frikinjay.fractalportals;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FractalPortalsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "fractalportals";
	public static final Logger LOGGER = LogManager.getLogger("fractalportals");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		CustomPortalBuilder.beginPortal()
		    .frameBlock(Blocks.CRYING_OBSIDIAN)
		    .destDimID(new Identifier("the_nether"))
		    .tintColor(131,66,184)
		    .flatPortal()
		    .registerPortal();


		LOGGER.info("Vertical Portals YAY!");
	}
}

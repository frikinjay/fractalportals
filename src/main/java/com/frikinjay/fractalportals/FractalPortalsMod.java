package com.frikinjay.fractalportals;

import com.frikinjay.fractalportals.init.PortalsInit;
import com.frikinjay.fractalportals.init.optionalaether.AetherPortalBlue;
import com.frikinjay.fractalportals.init.optionalaether.AetherPortalInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
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
		PortalsInit.registerPortals();

		if(FabricLoader.getInstance().isModLoaded("the_aether"))
		{
			AetherPortalBlue.init();
			AetherPortalInit.registerAetherPortal();
		}

		LOGGER.info("Vertical Portals YAY!");
	}
}

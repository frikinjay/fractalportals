package com.frikinjay.fractalportals;

import com.frikinjay.fractalportals.common.registry.ModBlockEntities;
import com.frikinjay.fractalportals.common.registry.ModBlocks;
import com.frikinjay.fractalportals.common.registry.ModItems;
import com.frikinjay.fractalportals.init.PortalsInit;
import com.frikinjay.fractalportals.init.optionalaether.AetherPortalBlue;
import com.frikinjay.fractalportals.init.optionalaether.AetherPortalInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FractalPortalsMod implements ModInitializer {

	public static final String MOD_ID = "fractalportals";
	public static final Logger LOGGER = LogManager.getLogger("fractalportals");


	@Override
	public void onInitialize() {

		ModBlocks.init();
		ModItems.init();
		ModBlockEntities.init();
		PortalsInit.registerPortals();


		if(FabricLoader.getInstance().isModLoaded("the_aether"))
		{
			AetherPortalBlue.init();
			AetherPortalInit.registerAetherPortal();
		}

		LOGGER.info("Horizontal Portals YAY!");
	}
}

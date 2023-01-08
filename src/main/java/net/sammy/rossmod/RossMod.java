package net.sammy.rossmod;

import net.fabricmc.api.ModInitializer;
import net.sammy.rossmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RossMod implements ModInitializer {
	public static final String MOD_ID = "rossmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registrarModItem();
	}
}

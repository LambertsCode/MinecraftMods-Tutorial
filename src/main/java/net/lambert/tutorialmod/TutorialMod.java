package net.lambert.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.lambert.tutorialmod.block.ModBlocks;
import net.lambert.tutorialmod.item.ModItemGroups;
import net.lambert.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod"; //mod id should be long enough to be unique when compared to other mods (all lower case, no spaces, can include _ and 0-9)
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}
package net.goofballgus.custombosses;

import net.fabricmc.api.ModInitializer;

import net.goofballgus.custombosses.block.ModBlocks;
import net.goofballgus.custombosses.item.ModItemGroups;
import net.goofballgus.custombosses.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomBosses implements ModInitializer {
    public static final String MOD_ID = "custombosses";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    @Override
    public void onInitialize() {
        ModItemGroups.registerModItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}

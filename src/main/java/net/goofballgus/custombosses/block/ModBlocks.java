package net.goofballgus.custombosses.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.goofballgus.custombosses.CustomBosses;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Helper methods
    public static void registerModBlocks() {
        CustomBosses.LOGGER.info("Registering Mod Blocks for " + CustomBosses.MOD_ID);
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(DUNE_BLOCK);
        });
    }
    
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CustomBosses.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CustomBosses.MOD_ID, name), block);
    }
    
    // Item blocks
    public static final Block DUNE_BLOCK = registerBlock("dune_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    
}

package net.goofballgus.custombosses.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.goofballgus.custombosses.CustomBosses;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Helper methods
    public static void registerModItems() {
        CustomBosses.LOGGER.info("Registering Mod Items for " + CustomBosses.MOD_ID);
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BOSS_JEWEL);
            entries.add(SHATTERED_BOSS_JEWEL);
        });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CustomBosses.MOD_ID, name), item);
    }
    
    // Item register
    public static final Item BOSS_JEWEL = registerItem("boss_jewel", new Item(new Item.Settings()));
    public static final Item SHATTERED_BOSS_JEWEL = registerItem("shattered_boss_jewel", new Item(new Item.Settings()));
}

package net.goofballgus.custombosses.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.goofballgus.custombosses.CustomBosses;
import net.goofballgus.custombosses.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static void registerModItemGroups() {
        CustomBosses.LOGGER.info("Registering Item Groups for " + CustomBosses.MOD_ID);
    }
    
    public static final ItemGroup BOSS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CustomBosses.MOD_ID, "boss_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BOSS_JEWEL))
                    .displayName(Text.translatable("itemgroup.custombosses.boss_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BOSS_JEWEL);
                        entries.add(ModItems.SHATTERED_BOSS_JEWEL);
                    }).build());
    
    public static final ItemGroup BOSS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CustomBosses.MOD_ID, "boss_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.DUNE_BLOCK))
                    .displayName(Text.translatable("itemgroup.custombosses.boss_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DUNE_BLOCK);
                    }).build());
}

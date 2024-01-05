package net.lambert.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lambert.tutorialmod.block.ModBlocks;
import net.lambert.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);

        addDrop(ModBlocks.OPAL_BLOCK);
        addDrop(ModBlocks.RAW_OPAL_BLOCK);

        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, copperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.END_STONE_RUBY_ORE, copperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE, ModItems.RAW_RUBY));

        addDrop(ModBlocks.OPAL_ORE, copperLikeOreDrops(ModBlocks.OPAL_ORE, ModItems.RAW_OPAL));
        addDrop(ModBlocks.DEEPSLATE_OPAL_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_OPAL_ORE, ModItems.RAW_OPAL));
        addDrop(ModBlocks.NETHER_OPAL_ORE, copperLikeOreDrops(ModBlocks.NETHER_OPAL_ORE, ModItems.RAW_OPAL));
        addDrop(ModBlocks.END_STONE_OPAL_ORE, copperLikeOreDrops(ModBlocks.END_STONE_OPAL_ORE, ModItems.RAW_OPAL));

        addDrop(ModBlocks.RUBY_STAIRS);
        addDrop(ModBlocks.RUBY_BUTTON);
        addDrop(ModBlocks.RUBY_PRESSURE_PLATE);
        addDrop(ModBlocks.RUBY_TRAPDOOR);
        addDrop(ModBlocks.RUBY_FENCE);
        addDrop(ModBlocks.RUBY_FENCE_GATE);
        addDrop(ModBlocks.RUBY_WALL);

        addDrop(ModBlocks.RUBY_DOOR, doorDrops(ModBlocks.RUBY_DOOR));
        addDrop(ModBlocks.RUBY_SLAB, slabDrops(ModBlocks.RUBY_SLAB));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder) ItemEntry
                                .builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

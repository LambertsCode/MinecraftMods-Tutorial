package net.lambert.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lambert.tutorialmod.block.ModBlocks;
import net.lambert.tutorialmod.util.ModTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.RUBY_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                /*RUBY*/
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_STONE_RUBY_ORE)

                /*OPAL*/
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.RAW_OPAL_BLOCK)
                .add(ModBlocks.OPAL_BLOCK_EXTRA)
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE)
                .add(ModBlocks.NETHER_OPAL_ORE)
                .add(ModBlocks.END_STONE_OPAL_ORE)

                /*MISC*/
                .add(ModBlocks.SOUND_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

                /*RUBY*/
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)

                /*OPAL*/
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.RAW_OPAL_BLOCK)
                .add(ModBlocks.OPAL_BLOCK_EXTRA)
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE)
                .add(ModBlocks.NETHER_OPAL_ORE)
                .add(ModBlocks.END_STONE_OPAL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.END_STONE_RUBY_ORE);

        /*RUBY*/
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.RUBY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.RUBY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL);

        /*OPAL*/
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.OPAL_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.OPAL_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.OPAL_WALL);

    }
}

package net.lambert.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lambert.tutorialmod.block.ModBlocks;
import net.lambert.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool opalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OPAL_BLOCK_EXTRA);

        /*RUBY*/
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);

        rubyPool.stairs(ModBlocks.RUBY_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_SLAB);
        rubyPool.button(ModBlocks.RUBY_BUTTON);
        rubyPool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);
        rubyPool.fence(ModBlocks.RUBY_FENCE);
        rubyPool.fenceGate(ModBlocks.RUBY_FENCE_GATE);
        rubyPool.wall(ModBlocks.RUBY_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.RUBY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);

        /*OPAL*/
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_OPAL_ORE);

        opalPool.stairs(ModBlocks.OPAL_STAIRS);
        opalPool.slab(ModBlocks.OPAL_SLAB);
        opalPool.button(ModBlocks.OPAL_BUTTON);
        opalPool.pressurePlate(ModBlocks.OPAL_PRESSURE_PLATE);
        opalPool.fence(ModBlocks.OPAL_FENCE);
        opalPool.fenceGate(ModBlocks.OPAL_FENCE_GATE);
        opalPool.wall(ModBlocks.OPAL_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.OPAL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.OPAL_TRAPDOOR);

        /*MISC*/
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OPAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.COAL_BRIQUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}

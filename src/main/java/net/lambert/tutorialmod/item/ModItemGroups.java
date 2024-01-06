package net.lambert.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lambert.tutorialmod.TutorialMod;
import net.lambert.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //add custom items here, order must be the same as the order added to the item group
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.RAW_OPAL);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.RUBY_STAFF);

                        entries.add(ModItems.TOMATO);

                        entries.add(ModItems.COAL_BRIQUETTE);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.RAW_OPAL_BLOCK);
                        entries.add(ModBlocks.OPAL_BLOCK_EXTRA);

                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                        entries.add(ModBlocks.OPAL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OPAL_ORE);
                        entries.add(ModBlocks.NETHER_OPAL_ORE);
                        entries.add(ModBlocks.END_STONE_OPAL_ORE);

                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);

                        entries.add(ModBlocks.OPAL_STAIRS);
                        entries.add(ModBlocks.OPAL_SLAB);
                        entries.add(ModBlocks.OPAL_BUTTON);
                        entries.add(ModBlocks.OPAL_PRESSURE_PLATE);
                        entries.add(ModBlocks.OPAL_FENCE);
                        entries.add(ModBlocks.OPAL_FENCE_GATE);
                        entries.add(ModBlocks.OPAL_WALL);
                        entries.add(ModBlocks.OPAL_DOOR);
                        entries.add(ModBlocks.OPAL_TRAPDOOR);


                    }).build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}

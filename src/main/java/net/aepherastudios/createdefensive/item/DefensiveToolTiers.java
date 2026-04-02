package net.aepherastudios.createdefensive.item;

import com.simibubi.create.AllItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class DefensiveToolTiers {

    public static final Tier ALUMINUM = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            250, 6f, 2f, 15, () -> Ingredient.of(DefensiveItems.ALUMINUM_INGOT));

    public static final Tier SILVER = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            250, 6.5f, 2.5f, 14, () -> Ingredient.of(DefensiveItems.SILVER_INGOT));

    public static final Tier PLATINUM = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1800, 9f, 3.5f, 10, () -> Ingredient.of(DefensiveItems.PLATINUM_INGOT));

    public static final Tier STEEL = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1800, 5f, 3f, 15, () -> Ingredient.of(DefensiveItems.STEEL_INGOT));

    public static final Tier COPPER = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            131, 6f, 2f, 40, () -> Ingredient.of(Items.COPPER_INGOT));

    public static final Tier ZINC = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            250, 6f, 2f, 15, () -> Ingredient.of(AllItems.ZINC_INGOT));

    public static final Tier BRASS = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561, 6f, 3f, 14, () -> Ingredient.of(AllItems.BRASS_INGOT));

    public static final Tier ROSE_QUARTZ = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561, 6f, 3f, 25, () -> Ingredient.of(AllItems.POLISHED_ROSE_QUARTZ));

    public static final Tier ELECTRUM = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            4062, 10f, 5f, 15, () -> Ingredient.of(DefensiveItems.ENERGIZED_ELECTRUM_INGOT));

    public static final Tier STARDUST = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            6092, 11f, 7f, 30, () -> Ingredient.of(DefensiveItems.STARDUST_INGOT));

    public static final Tier PYRAEN = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            7310, 12f, 9f, 35, () -> Ingredient.of(DefensiveItems.PYRAEN_INGOT));
}
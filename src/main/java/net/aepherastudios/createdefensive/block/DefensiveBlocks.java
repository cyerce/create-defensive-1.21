package net.aepherastudios.createdefensive.block;

import com.simibubi.create.content.decoration.palettes.GlassPaneBlock;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.custom.*;
import net.aepherastudios.createdefensive.block.custom.explosive.*;
import net.aepherastudios.createdefensive.block.custom.machine.*;
import net.aepherastudios.createdefensive.block.custom.trap.*;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateDefensive.MOD_ID);

    public static final DeferredBlock<Block> TAR_SAND = registerBlock("tar_sand",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> GAS_VENT = registerBlock("gas_vent",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_BISMUTH_ORE = registerBlock("deepslate_bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SALT_ORE = registerBlock("deepslate_salt_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SULFUR_ORE = registerBlock("deepslate_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK = registerBlock("powdered_uranium_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_10 = registerBlock("powdered_uranium_block_10",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_20 = registerBlock("powdered_uranium_block_20",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_30 = registerBlock("powdered_uranium_block_30",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_40 = registerBlock("powdered_uranium_block_40",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_50 = registerBlock("powdered_uranium_block_50",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_60 = registerBlock("powdered_uranium_block_60",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_70 = registerBlock("powdered_uranium_block_70",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));
    public static final DeferredBlock<Block> POWDERED_URANIUM_BLOCK_80 = registerBlock("powdered_uranium_block_80",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.SAND)));

    public static final DeferredBlock<Block> BLEEDING_OBSIDIAN = registerBlock("bleeding_obsidian",
            () -> new Block(BlockBehaviour.Properties.of().strength(50f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> POLONIUM_BLOCK = registerBlock("polonium_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> GUNSTEEL_BLOCK = registerBlock("gunsteel_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> STABALLOY_BLOCK = registerBlock("staballoy_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> LEAD_GLASS = registerBlock("lead_glass",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion().explosionResistance(100).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> BULLETPROOF_GLASS = registerBlock("bulletproof_glass",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).noOcclusion().explosionResistance(500).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> LEAD_GLASS_PANE = registerBlock("lead_glass_pane",
            () -> new GlassPaneBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion().explosionResistance(50).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> BULLETPROOF_GLASS_PANE = registerBlock("bulletproof_glass_pane",
            () -> new GlassPaneBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion().explosionResistance(300).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> VIOLET_GOLD_BLOCK = registerBlock("violet_gold_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_BISMUTH_BLOCK = registerBlock("raw_bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> TREATED_OAK_PLANKS = registerBlock("treated_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    // 2f1d00, 0.6a

    public static final DeferredBlock<Block> RED_ASPHALT = registerBlock("red_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ORANGE_ASPHALT = registerBlock("orange_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> YELLOW_ASPHALT = registerBlock("yellow_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LIME_ASPHALT = registerBlock("lime_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GREEN_ASPHALT = registerBlock("green_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> CYAN_ASPHALT = registerBlock("cyan_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LIGHT_BLUE_ASPHALT = registerBlock("light_blue_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLUE_ASPHALT = registerBlock("blue_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PURPLE_ASPHALT = registerBlock("purple_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> MAGENTA_ASPHALT = registerBlock("magenta_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PINK_ASPHALT = registerBlock("pink_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> WHITE_ASPHALT = registerBlock("white_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LIGHT_GRAY_ASPHALT = registerBlock("light_gray_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRAY_ASPHALT = registerBlock("gray_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACK_ASPHALT = registerBlock("black_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BROWN_ASPHALT = registerBlock("brown_asphalt",
            () -> new AsphaltBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COKING_OVEN = registerBlock("coking_oven",
            () -> new CokingOvenBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> CENTRIFUGE = registerBlock("centrifuge",
            () -> new CentrifugeBlock(BlockBehaviour.Properties.of().noOcclusion().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> FRACTIONAL_STILL_CONTROLLER = registerBlock("fractional_still_controller",
            () -> new FractionalStillControllerBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> FRACTIONAL_STILL_TANK = registerBlock("fractional_still_tank",
            () -> new FractionalStillTankBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ELECTROLYSIS_CONTROLLER = registerBlock("electrolysis_controller",
            () -> new ElectrolysisControllerBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COPPER_ELECTROLYSIS_TANK = registerBlock("copper_electrolysis_tank",
            () -> new CopperElectrolysisTankBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ZINC_ELECTROLYSIS_TANK = registerBlock("zinc_electrolysis_tank",
            () -> new ZincElectrolysisTankBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> REACTOR = registerBlock("reactor",
            () -> new ReactorBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> REACTOR_RESOURCE_TANK = registerBlock("reactor_resource_tank",
            () -> new ReactorResourceTankBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> REACTOR_COOLANT_TANK = registerBlock("reactor_coolant_tank",
            () -> new ReactorCoolantTankBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final DeferredBlock<Block> SLAG_BLOCK = registerBlock("slag_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> LANDMINE = registerBlock("landmine",
            () -> new LandmineBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> PROXIMITY_MINE = registerBlock("proximity_mine",
            () -> new ProximityMineBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> FIRE_GRATE = registerBlock("fire_grate",
            () -> new FireGrateBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> LIGHTNING_TRAP = registerBlock("lightning_trap",
            () -> new LightningTrapBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> AIR_TRAP = registerBlock("air_trap",
            () -> new AirTrapBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> GAS_TRAP = registerBlock("gas_trap",
            () -> new GasTrapBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> AMETHYST_TILES = registerBlock("amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_AMETHYST_TILES = registerBlock("small_amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> REDSTONE_TILES = registerBlock("redstone_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_REDSTONE_TILES = registerBlock("small_redstone_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> EMERALD_TILES = registerBlock("emerald_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_EMERALD_TILES = registerBlock("small_emerald_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> QUARTZ_TILES = registerBlock("quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_QUARTZ_TILES = registerBlock("small_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> LAPIS_TILES = registerBlock("lapis_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_LAPIS_TILES = registerBlock("small_lapis_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIAMOND_TILES = registerBlock("diamond_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMALL_DIAMOND_TILES = registerBlock("small_diamond_tiles",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> OAK_TRUSS = registerBlock("oak_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_TRUSS = registerBlock("birch_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_TRUSS = registerBlock("spruce_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_TRUSS = registerBlock("jungle_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_TRUSS = registerBlock("dark_oak_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_TRUSS = registerBlock("acacia_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_TRUSS = registerBlock("mangrove_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_TRUSS = registerBlock("cherry_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ANDESITE_TRUSS = registerBlock("andesite_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ZINC_TRUSS = registerBlock("zinc_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BRASS_TRUSS = registerBlock("brass_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COPPER_TRUSS = registerBlock("copper_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> INDUSTRIAL_IRON_TRUSS = registerBlock("industrial_iron_truss",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COPPER_BLAST_PLATING = registerBlock("copper_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(200).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> COMPACT_INDUSTRIAL_IRON_BLOCK = registerBlock("compact_industrial_iron_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> INDUSTRIAL_IRON_BLAST_PLATING = registerBlock("industrial_iron_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(300).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> ZINC_BLAST_PLATING = registerBlock("zinc_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(500).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> BRASS_BLAST_PLATING = registerBlock("brass_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(750).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> STEEL_BLAST_PLATING = registerBlock("steel_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> RED_BLAST_PLATING = registerBlock("red_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> ORANGE_BLAST_PLATING = registerBlock("orange_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> YELLOW_BLAST_PLATING = registerBlock("yellow_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> LIME_BLAST_PLATING = registerBlock("lime_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> GREEN_BLAST_PLATING = registerBlock("green_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> CYAN_BLAST_PLATING = registerBlock("cyan_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> LIGHT_BLUE_BLAST_PLATING = registerBlock("light_blue_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> BLUE_BLAST_PLATING = registerBlock("blue_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> PURPLE_BLAST_PLATING = registerBlock("purple_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> MAGENTA_BLAST_PLATING = registerBlock("magenta_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> PINK_BLAST_PLATING = registerBlock("pink_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> BLACK_BLAST_PLATING = registerBlock("black_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> GRAY_BLAST_PLATING = registerBlock("gray_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> LIGHT_GRAY_BLAST_PLATING = registerBlock("light_gray_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> WHITE_BLAST_PLATING = registerBlock("white_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> BROWN_BLAST_PLATING = registerBlock("brown_blast_plating",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).explosionResistance(1000).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> CATALYST_CRYSTAL = registerBlock("catalyst_crystal",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SMOKE_CATALYST = registerBlock("smoke_catalyst",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLAST_CATALYST = registerBlock("blast_catalyst",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SPLASH_CATALYST = registerBlock("splash_catalyst",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> HAUNT_CATALYST = registerBlock("haunt_catalyst",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> HIGH_POWER_EXPLOSIVE = registerBlock("high_power_explosive",
            () -> new HighPowerExplosiveBlock(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> CHEMICAL_EXPLOSIVE = registerBlock("chemical_explosive",
            () -> new ChemicalExplosiveBlock(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.GRASS)));
    public static final DeferredBlock<Block> INCENDIARY_EXPLOSIVE = registerBlock("incendiary_explosive",
            () -> new IncendiaryExplosiveBlock(BlockBehaviour.Properties.of().strength(0f).sound(SoundType.GRASS)));

    public static final DeferredBlock<Block> CONVENTIONAL_WARHEAD = registerBlock("conventional_warhead",
            () -> new ConventionalWarheadBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> INCENDIARY_WARHEAD = registerBlock("incendiary_warhead",
            () -> new IncendiaryWarheadBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> CHEMICAL_WARHEAD = registerBlock("chemical_warhead",
            () -> new ChemicalWarheadBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> NUCLEAR_WARHEAD = registerBlock("nuclear_warhead",
            () -> new NuclearWarheadBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> REDSTONE_CRYSTAL_BLOCK = registerBlock("redstone_crystal_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<LiquidBlock> CRUDE_OIL = BLOCKS.register("crude_oil",
            () -> new OilBlock(DefensiveFluids.SOURCE_CRUDE_OIL, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> DIRTY_RAW_CRUDE_OIL = BLOCKS.register("dirty_raw_crude_oil",
            () -> new OilBlock(DefensiveFluids.SOURCE_DIRTY_RAW_CRUDE_OIL, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> RAW_CRUDE_OIL = BLOCKS.register("raw_crude_oil",
            () -> new OilBlock(DefensiveFluids.SOURCE_RAW_CRUDE_OIL, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> NATURAL_GAS = BLOCKS.register("natural_gas",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_NATURAL_GAS.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> RAW_NATURAL_GAS = BLOCKS.register("raw_natural_gas",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_RAW_NATURAL_GAS.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> GASOLINE = BLOCKS.register("gasoline",
            () -> new OilBlock(DefensiveFluids.SOURCE_GASOLINE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> KEROSENE = BLOCKS.register("kerosene",
            () -> new OilBlock(DefensiveFluids.SOURCE_KEROSENE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> DIESEL = BLOCKS.register("diesel",
            () -> new OilBlock(DefensiveFluids.SOURCE_DIESEL, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> BITUMEN = BLOCKS.register("bitumen",
            () -> new OilBlock(DefensiveFluids.SOURCE_BITUMEN, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> BUTANE = BLOCKS.register("butane",
            () -> new OilBlock(DefensiveFluids.SOURCE_BUTANE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> PROPANE = BLOCKS.register("propane",
            () -> new OilBlock(DefensiveFluids.SOURCE_PROPANE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> ETHANE = BLOCKS.register("ethane",
            () -> new OilBlock(DefensiveFluids.SOURCE_ETHANE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> METHANE = BLOCKS.register("methane",
            () -> new OilBlock(DefensiveFluids.SOURCE_METHANE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> CREOSOTE = BLOCKS.register("creosote",
            () -> new OilBlock(DefensiveFluids.SOURCE_CREOSOTE, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> STEAM = BLOCKS.register("steam",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_STEAM.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> HYDROGEN = BLOCKS.register("hydrogen",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_HYDROGEN.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> OXYGEN = BLOCKS.register("oxygen",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_OXYGEN.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> MUSTARD_GAS = BLOCKS.register("mustard_gas",
            () -> new MustardGasBlock(DefensiveFluids.SOURCE_MUSTARD_GAS, BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> AMMONIA = BLOCKS.register("ammonia",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_AMMONIA.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> FORMALDEHYDE = BLOCKS.register("formaldehyde",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_FORMALDEHYDE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> METHANOL = BLOCKS.register("methanol",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_METHANOL.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> CARBON_MONOXIDE = BLOCKS.register("carbon_monoxide",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_CARBON_MONOXIDE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> ETHYLENE = BLOCKS.register("ethylene",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_ETHYLENE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> SULFUR_DICHLORIDE = BLOCKS.register("sulfur_dichloride",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_SULFUR_DICHLORIDE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> CHLORINE = BLOCKS.register("chlorine",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_CHLORINE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> BENZENE = BLOCKS.register("benzene",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_BENZENE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> ETHYLBENZENE = BLOCKS.register("ethylbenzene",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_ETHYLBENZENE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> STYRENE = BLOCKS.register("styrene",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_STYRENE.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> MOLTEN_SALT = BLOCKS.register("molten_salt",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_MOLTEN_SALT.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> MOLTEN_SODIUM = BLOCKS.register("molten_sodium",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_MOLTEN_SODIUM.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> IRRADIATED_WATER = BLOCKS.register("irradiated_water",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_IRRADIATED_WATER.get(), BlockBehaviour.Properties.of().replaceable()));
    public static final DeferredBlock<LiquidBlock> SUPERHEATED_IRRADIATED_WATER = BLOCKS.register("superheated_irradiated_water",
            () -> new LiquidBlock(DefensiveFluids.SOURCE_SUPERHEATED_IRRADIATED_WATER.get(), BlockBehaviour.Properties.of().replaceable()));






    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        DefensiveItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

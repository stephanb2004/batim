
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bendymod.item.StudioAxeItem;
import net.mcreator.bendymod.item.BaconSoupItem;
import net.mcreator.bendymod.block.display.ValveDisplayItem;
import net.mcreator.bendymod.block.display.TrashBinDisplayItem;
import net.mcreator.bendymod.block.display.StudioLampDisplayItem;
import net.mcreator.bendymod.block.display.SpeakerDisplayItem;
import net.mcreator.bendymod.block.display.RecordDisplayItem;
import net.mcreator.bendymod.block.display.RadioDisplayItem;
import net.mcreator.bendymod.block.display.LeverStudioDisplayItem;
import net.mcreator.bendymod.block.display.LeverPowerDisplayItem;
import net.mcreator.bendymod.block.display.JumbledPaperDisplayItem;
import net.mcreator.bendymod.block.display.InkPipeVerticalDisplayItem;
import net.mcreator.bendymod.block.display.InkPipeStraightDisplayItem;
import net.mcreator.bendymod.block.display.InkPipeHorizontalDisplayItem;
import net.mcreator.bendymod.block.display.InkMachineDisplayItem;
import net.mcreator.bendymod.block.display.DresserDisplayItem;
import net.mcreator.bendymod.block.display.DeskDisplayItem;
import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;
import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;
import net.mcreator.bendymod.block.display.CassettePlayerDisplayItem;
import net.mcreator.bendymod.block.display.BoardsDisplayItem;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BendymodMod.MODID);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL = block(BendymodModBlocks.STUDIO_BLANK_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_STAIRS = block(BendymodModBlocks.STUDIO_BLANK_WALL_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_SLAB = block(BendymodModBlocks.STUDIO_BLANK_WALL_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL = block(BendymodModBlocks.STUDIO_PLANKED_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL_BROKEN = block(BendymodModBlocks.STUDIO_PLANKED_WALL_BROKEN, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_CEILING = block(BendymodModBlocks.STUDIO_CEILING, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR = block(BendymodModBlocks.STUDIO_FLOOR, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_STAIRS = block(BendymodModBlocks.STUDIO_FLOOR_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_SLAB = block(BendymodModBlocks.STUDIO_FLOOR_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> BENDY_SPAWN_EGG = REGISTRY.register("bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.BENDY, -15724785, -12955, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> BORIS_BUDDY_SPAWN_EGG = REGISTRY.register("boris_buddy_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.BORIS_BUDDY, -15724785, -1587590, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SEARCHER_SPAWN_EGG = REGISTRY.register("searcher_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.SEARCHER, -16579837, -15790578, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> INK_BENDY_SPAWN_EGG = REGISTRY.register("ink_bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.INK_BENDY, -15724785, -21220, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SAMMY_LAWRENCE_SPAWN_EGG = REGISTRY.register("sammy_lawrence_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.SAMMY_LAWRENCE, -16579837, -3365807, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> STUDIO_AXE = REGISTRY.register("studio_axe", () -> new StudioAxeItem());
	public static final RegistryObject<Item> CUTOUT_BENDY = REGISTRY.register(BendymodModBlocks.CUTOUT_BENDY.getId().getPath(),
			() -> new CutoutBendyDisplayItem(BendymodModBlocks.CUTOUT_BENDY.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> CUTOUT_SINNY = REGISTRY.register(BendymodModBlocks.CUTOUT_SINNY.getId().getPath(), () -> new CutoutSinnyDisplayItem(BendymodModBlocks.CUTOUT_SINNY.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STUDIO_DOOR_BASIC = doubleBlock(BendymodModBlocks.STUDIO_DOOR_BASIC, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_DOOR_SEGMENTED = doubleBlock(BendymodModBlocks.STUDIO_DOOR_SEGMENTED, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> INK_MACHINE = REGISTRY.register(BendymodModBlocks.INK_MACHINE.getId().getPath(),
			() -> new InkMachineDisplayItem(BendymodModBlocks.INK_MACHINE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> SPEAKER = REGISTRY.register(BendymodModBlocks.SPEAKER.getId().getPath(), () -> new SpeakerDisplayItem(BendymodModBlocks.SPEAKER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> STUDIO_LAMP = REGISTRY.register(BendymodModBlocks.STUDIO_LAMP.getId().getPath(),
			() -> new StudioLampDisplayItem(BendymodModBlocks.STUDIO_LAMP.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> DRESSER = REGISTRY.register(BendymodModBlocks.DRESSER.getId().getPath(), () -> new DresserDisplayItem(BendymodModBlocks.DRESSER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> INK_PIPE_HORIZONTAL = REGISTRY.register(BendymodModBlocks.INK_PIPE_HORIZONTAL.getId().getPath(),
			() -> new InkPipeHorizontalDisplayItem(BendymodModBlocks.INK_PIPE_HORIZONTAL.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> INK_PIPE_VERTICAL = REGISTRY.register(BendymodModBlocks.INK_PIPE_VERTICAL.getId().getPath(),
			() -> new InkPipeVerticalDisplayItem(BendymodModBlocks.INK_PIPE_VERTICAL.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> INK_PIPE_STRAIGHT = REGISTRY.register(BendymodModBlocks.INK_PIPE_STRAIGHT.getId().getPath(),
			() -> new InkPipeStraightDisplayItem(BendymodModBlocks.INK_PIPE_STRAIGHT.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> LEVER_POWER = REGISTRY.register(BendymodModBlocks.LEVER_POWER.getId().getPath(),
			() -> new LeverPowerDisplayItem(BendymodModBlocks.LEVER_POWER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> LEVER_STUDIO = REGISTRY.register(BendymodModBlocks.LEVER_STUDIO.getId().getPath(),
			() -> new LeverStudioDisplayItem(BendymodModBlocks.LEVER_STUDIO.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> VALVE = REGISTRY.register(BendymodModBlocks.VALVE.getId().getPath(), () -> new ValveDisplayItem(BendymodModBlocks.VALVE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> RECORD = REGISTRY.register(BendymodModBlocks.RECORD.getId().getPath(), () -> new RecordDisplayItem(BendymodModBlocks.RECORD.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> TRASH_BIN = REGISTRY.register(BendymodModBlocks.TRASH_BIN.getId().getPath(), () -> new TrashBinDisplayItem(BendymodModBlocks.TRASH_BIN.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> JUMBLED_PAPER = REGISTRY.register(BendymodModBlocks.JUMBLED_PAPER.getId().getPath(),
			() -> new JumbledPaperDisplayItem(BendymodModBlocks.JUMBLED_PAPER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> BOARDS = REGISTRY.register(BendymodModBlocks.BOARDS.getId().getPath(), () -> new BoardsDisplayItem(BendymodModBlocks.BOARDS.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> BACON_SOUP = REGISTRY.register("bacon_soup", () -> new BaconSoupItem());
	public static final RegistryObject<Item> RADIO = REGISTRY.register(BendymodModBlocks.RADIO.getId().getPath(), () -> new RadioDisplayItem(BendymodModBlocks.RADIO.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> CASSETTE_PLAYER = REGISTRY.register(BendymodModBlocks.CASSETTE_PLAYER.getId().getPath(),
			() -> new CassettePlayerDisplayItem(BendymodModBlocks.CASSETTE_PLAYER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> DESK = REGISTRY.register(BendymodModBlocks.DESK.getId().getPath(), () -> new DeskDisplayItem(BendymodModBlocks.DESK.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}


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
import net.mcreator.bendymod.item.InkItem;
import net.mcreator.bendymod.item.BaconSoupItem;
import net.mcreator.bendymod.block.display.WritingWhosLaughingNowDisplayItem;
import net.mcreator.bendymod.block.display.WritingTheSheepWillComeToSlaughterDisplayItem;
import net.mcreator.bendymod.block.display.WritingTheCreatorLiedToUsDisplayItem;
import net.mcreator.bendymod.block.display.WritingSingWithMeDisplayItem;
import net.mcreator.bendymod.block.display.WritingItsTimeToBelieveDisplayItem;
import net.mcreator.bendymod.block.display.WritingDreamsComeTrueDisplayItem;
import net.mcreator.bendymod.block.display.WritingDownHereWereAllSinnersDisplayItem;
import net.mcreator.bendymod.block.display.WorkTableDisplayItem;
import net.mcreator.bendymod.block.display.ValveDisplayItem;
import net.mcreator.bendymod.block.display.TrashBinDisplayItem;
import net.mcreator.bendymod.block.display.ToolboxDisplayItem;
import net.mcreator.bendymod.block.display.StudioChairDisplayItem;
import net.mcreator.bendymod.block.display.SpeakerDisplayItem;
import net.mcreator.bendymod.block.display.SoupCandleDisplayItem;
import net.mcreator.bendymod.block.display.ShelfDisplayItem;
import net.mcreator.bendymod.block.display.ReelDisplayItem;
import net.mcreator.bendymod.block.display.RecordingSignOnDisplayItem;
import net.mcreator.bendymod.block.display.RecordingSignOffDisplayItem;
import net.mcreator.bendymod.block.display.RecordDisplayItem;
import net.mcreator.bendymod.block.display.RadioDisplayItem;
import net.mcreator.bendymod.block.display.ProjectorDisplayItem;
import net.mcreator.bendymod.block.display.MusicDepartmentSignDisplayItem;
import net.mcreator.bendymod.block.display.LeverStudioDisplayItem;
import net.mcreator.bendymod.block.display.LeverPowerDisplayItem;
import net.mcreator.bendymod.block.display.JumbledPaperDisplayItem;
import net.mcreator.bendymod.block.display.JDSSignDisplayItem;
import net.mcreator.bendymod.block.display.InkMachineDisplayItem;
import net.mcreator.bendymod.block.display.InkBarrelDisplayItem;
import net.mcreator.bendymod.block.display.HatRackDisplayItem;
import net.mcreator.bendymod.block.display.GearboxDisplayItem;
import net.mcreator.bendymod.block.display.DresserDisplayItem;
import net.mcreator.bendymod.block.display.DeskFancyDisplayItem;
import net.mcreator.bendymod.block.display.DeskDisplayItem;
import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;
import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;
import net.mcreator.bendymod.block.display.CoffinDisplayItem;
import net.mcreator.bendymod.block.display.CassettePlayerDisplayItem;
import net.mcreator.bendymod.block.display.BorisCloneDisplayItem;
import net.mcreator.bendymod.block.display.BoardsDisplayItem;
import net.mcreator.bendymod.block.display.BendyStatueDisplayItem;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BendymodMod.MODID);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL = block(BendymodModBlocks.STUDIO_BLANK_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_STAIRS = block(BendymodModBlocks.STUDIO_BLANK_WALL_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_SLAB = block(BendymodModBlocks.STUDIO_BLANK_WALL_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_FENCE = block(BendymodModBlocks.STUDIO_BLANK_WALL_FENCE, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL = block(BendymodModBlocks.STUDIO_PLANKED_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL_BROKEN = block(BendymodModBlocks.STUDIO_PLANKED_WALL_BROKEN, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_TILED_WALL = block(BendymodModBlocks.STUDIO_TILED_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_CEILING = block(BendymodModBlocks.STUDIO_CEILING, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR = block(BendymodModBlocks.STUDIO_FLOOR, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BROKEN_FLOOR = block(BendymodModBlocks.STUDIO_BROKEN_FLOOR, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_STAIRS = block(BendymodModBlocks.STUDIO_FLOOR_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_SLAB = block(BendymodModBlocks.STUDIO_FLOOR_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_FENCE = block(BendymodModBlocks.STUDIO_FLOOR_FENCE, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BRICKS = block(BendymodModBlocks.STUDIO_BRICKS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BRICK_STAIRS = block(BendymodModBlocks.STUDIO_BRICK_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BRICK_SLAB = block(BendymodModBlocks.STUDIO_BRICK_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_DIRT = block(BendymodModBlocks.STUDIO_DIRT, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_DOOR_BASIC = doubleBlock(BendymodModBlocks.STUDIO_DOOR_BASIC, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_DOOR_SEGMENTED = doubleBlock(BendymodModBlocks.STUDIO_DOOR_SEGMENTED, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> PLANKED_TRAPDOOR = block(BendymodModBlocks.PLANKED_TRAPDOOR, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> CHAIN_FENCE = block(BendymodModBlocks.CHAIN_FENCE, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_AXE = REGISTRY.register("studio_axe", () -> new StudioAxeItem());
	public static final RegistryObject<Item> BACON_SOUP = REGISTRY.register("bacon_soup", () -> new BaconSoupItem());
	public static final RegistryObject<Item> INK_BUCKET = REGISTRY.register("ink_bucket", () -> new InkItem());
	public static final RegistryObject<Item> CRATE = block(BendymodModBlocks.CRATE, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> VENT_COVER = block(BendymodModBlocks.VENT_COVER, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> SIGN_LIGHT = block(BendymodModBlocks.SIGN_LIGHT, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> SIGN_DARK = block(BendymodModBlocks.SIGN_DARK, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_LITTLE_DEVIL_DARLIN = block(BendymodModBlocks.POSTER_LITTLE_DEVIL_DARLIN, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_DANCING_DEMON = block(BendymodModBlocks.POSTER_DANCING_DEMON, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_SHEEP_SONGS = block(BendymodModBlocks.POSTER_SHEEP_SONGS, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_LARGE_LITTLE_DEVIL_DARLIN = block(BendymodModBlocks.POSTER_LARGE_LITTLE_DEVIL_DARLIN, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_LARGE_DANCING_DEMON = block(BendymodModBlocks.POSTER_LARGE_DANCING_DEMON, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> POSTER_LARGE_SHEEP_SONGS = block(BendymodModBlocks.POSTER_LARGE_SHEEP_SONGS, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> CUTOUT_BENDY = REGISTRY.register(BendymodModBlocks.CUTOUT_BENDY.getId().getPath(),
			() -> new CutoutBendyDisplayItem(BendymodModBlocks.CUTOUT_BENDY.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> PROJECTOR = REGISTRY.register(BendymodModBlocks.PROJECTOR.getId().getPath(), () -> new ProjectorDisplayItem(BendymodModBlocks.PROJECTOR.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> DESK = REGISTRY.register(BendymodModBlocks.DESK.getId().getPath(), () -> new DeskDisplayItem(BendymodModBlocks.DESK.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> STUDIO_CHAIR = REGISTRY.register(BendymodModBlocks.STUDIO_CHAIR.getId().getPath(),
			() -> new StudioChairDisplayItem(BendymodModBlocks.STUDIO_CHAIR.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> DRESSER = REGISTRY.register(BendymodModBlocks.DRESSER.getId().getPath(), () -> new DresserDisplayItem(BendymodModBlocks.DRESSER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> INK_BARREL = REGISTRY.register(BendymodModBlocks.INK_BARREL.getId().getPath(),
			() -> new InkBarrelDisplayItem(BendymodModBlocks.INK_BARREL.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> STUDIO_LAMP = block(BendymodModBlocks.STUDIO_LAMP, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> TRASH_BIN = REGISTRY.register(BendymodModBlocks.TRASH_BIN.getId().getPath(), () -> new TrashBinDisplayItem(BendymodModBlocks.TRASH_BIN.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> RADIO = REGISTRY.register(BendymodModBlocks.RADIO.getId().getPath(), () -> new RadioDisplayItem(BendymodModBlocks.RADIO.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> SPEAKER = REGISTRY.register(BendymodModBlocks.SPEAKER.getId().getPath(), () -> new SpeakerDisplayItem(BendymodModBlocks.SPEAKER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> CASSETTE_PLAYER = REGISTRY.register(BendymodModBlocks.CASSETTE_PLAYER.getId().getPath(),
			() -> new CassettePlayerDisplayItem(BendymodModBlocks.CASSETTE_PLAYER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> LEVER_POWER = REGISTRY.register(BendymodModBlocks.LEVER_POWER.getId().getPath(),
			() -> new LeverPowerDisplayItem(BendymodModBlocks.LEVER_POWER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> LEVER_STUDIO = REGISTRY.register(BendymodModBlocks.LEVER_STUDIO.getId().getPath(),
			() -> new LeverStudioDisplayItem(BendymodModBlocks.LEVER_STUDIO.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> VALVE = REGISTRY.register(BendymodModBlocks.VALVE.getId().getPath(), () -> new ValveDisplayItem(BendymodModBlocks.VALVE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> INK_PUDDLE = block(BendymodModBlocks.INK_PUDDLE, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> INK_PUDDLE_WALL = block(BendymodModBlocks.INK_PUDDLE_WALL, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> INK_MACHINE = REGISTRY.register(BendymodModBlocks.INK_MACHINE.getId().getPath(),
			() -> new InkMachineDisplayItem(BendymodModBlocks.INK_MACHINE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> RECORD = REGISTRY.register(BendymodModBlocks.RECORD.getId().getPath(), () -> new RecordDisplayItem(BendymodModBlocks.RECORD.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> JUMBLED_PAPER = REGISTRY.register(BendymodModBlocks.JUMBLED_PAPER.getId().getPath(),
			() -> new JumbledPaperDisplayItem(BendymodModBlocks.JUMBLED_PAPER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> BOARDS = REGISTRY.register(BendymodModBlocks.BOARDS.getId().getPath(), () -> new BoardsDisplayItem(BendymodModBlocks.BOARDS.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> BORIS_CLONE = REGISTRY.register(BendymodModBlocks.BORIS_CLONE.getId().getPath(),
			() -> new BorisCloneDisplayItem(BendymodModBlocks.BORIS_CLONE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> BENDY_STATUE = REGISTRY.register(BendymodModBlocks.BENDY_STATUE.getId().getPath(),
			() -> new BendyStatueDisplayItem(BendymodModBlocks.BENDY_STATUE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> COFFIN = REGISTRY.register(BendymodModBlocks.COFFIN.getId().getPath(), () -> new CoffinDisplayItem(BendymodModBlocks.COFFIN.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> REEL = REGISTRY.register(BendymodModBlocks.REEL.getId().getPath(), () -> new ReelDisplayItem(BendymodModBlocks.REEL.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> SOUP_CANDLE = REGISTRY.register(BendymodModBlocks.SOUP_CANDLE.getId().getPath(),
			() -> new SoupCandleDisplayItem(BendymodModBlocks.SOUP_CANDLE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> DESK_FANCY = REGISTRY.register(BendymodModBlocks.DESK_FANCY.getId().getPath(),
			() -> new DeskFancyDisplayItem(BendymodModBlocks.DESK_FANCY.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> SHELF = REGISTRY.register(BendymodModBlocks.SHELF.getId().getPath(), () -> new ShelfDisplayItem(BendymodModBlocks.SHELF.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> JDS_SIGN = REGISTRY.register(BendymodModBlocks.JDS_SIGN.getId().getPath(), () -> new JDSSignDisplayItem(BendymodModBlocks.JDS_SIGN.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WORK_TABLE = REGISTRY.register(BendymodModBlocks.WORK_TABLE.getId().getPath(),
			() -> new WorkTableDisplayItem(BendymodModBlocks.WORK_TABLE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> MUSIC_DEPARTMENT_SIGN = REGISTRY.register(BendymodModBlocks.MUSIC_DEPARTMENT_SIGN.getId().getPath(),
			() -> new MusicDepartmentSignDisplayItem(BendymodModBlocks.MUSIC_DEPARTMENT_SIGN.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> PIPE_STRAIGHT = block(BendymodModBlocks.PIPE_STRAIGHT, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> PIPE_WALL_VERTICAL = block(BendymodModBlocks.PIPE_WALL_VERTICAL, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> PIPE_WALL_HORIZONTAL = block(BendymodModBlocks.PIPE_WALL_HORIZONTAL, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> GEARBOX = REGISTRY.register(BendymodModBlocks.GEARBOX.getId().getPath(), () -> new GearboxDisplayItem(BendymodModBlocks.GEARBOX.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> TOOLBOX = REGISTRY.register(BendymodModBlocks.TOOLBOX.getId().getPath(), () -> new ToolboxDisplayItem(BendymodModBlocks.TOOLBOX.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> HAT_RACK = REGISTRY.register(BendymodModBlocks.HAT_RACK.getId().getPath(), () -> new HatRackDisplayItem(BendymodModBlocks.HAT_RACK.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_DREAMS_COME_TRUE = REGISTRY.register(BendymodModBlocks.WRITING_DREAMS_COME_TRUE.getId().getPath(),
			() -> new WritingDreamsComeTrueDisplayItem(BendymodModBlocks.WRITING_DREAMS_COME_TRUE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_WHOS_LAUGHING_NOW = REGISTRY.register(BendymodModBlocks.WRITING_WHOS_LAUGHING_NOW.getId().getPath(),
			() -> new WritingWhosLaughingNowDisplayItem(BendymodModBlocks.WRITING_WHOS_LAUGHING_NOW.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_THE_CREATOR_LIED_TO_US = REGISTRY.register(BendymodModBlocks.WRITING_THE_CREATOR_LIED_TO_US.getId().getPath(),
			() -> new WritingTheCreatorLiedToUsDisplayItem(BendymodModBlocks.WRITING_THE_CREATOR_LIED_TO_US.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_ITS_TIME_TO_BELIEVE = REGISTRY.register(BendymodModBlocks.WRITING_ITS_TIME_TO_BELIEVE.getId().getPath(),
			() -> new WritingItsTimeToBelieveDisplayItem(BendymodModBlocks.WRITING_ITS_TIME_TO_BELIEVE.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER = REGISTRY.register(BendymodModBlocks.WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER.getId().getPath(),
			() -> new WritingTheSheepWillComeToSlaughterDisplayItem(BendymodModBlocks.WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_SING_WITH_ME = REGISTRY.register(BendymodModBlocks.WRITING_SING_WITH_ME.getId().getPath(),
			() -> new WritingSingWithMeDisplayItem(BendymodModBlocks.WRITING_SING_WITH_ME.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> WRITING_DOWN_HERE_WERE_ALL_SINNERS = REGISTRY.register(BendymodModBlocks.WRITING_DOWN_HERE_WERE_ALL_SINNERS.getId().getPath(),
			() -> new WritingDownHereWereAllSinnersDisplayItem(BendymodModBlocks.WRITING_DOWN_HERE_WERE_ALL_SINNERS.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> RITUAL_SUMMONING = block(BendymodModBlocks.RITUAL_SUMMONING, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> BENDY_SPAWN_EGG = REGISTRY.register("bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.BENDY, -15724785, -12955, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> BORIS_BUDDY_SPAWN_EGG = REGISTRY.register("boris_buddy_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.BORIS_BUDDY, -15724785, -1587590, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SEARCHER_SPAWN_EGG = REGISTRY.register("searcher_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.SEARCHER, -16579837, -15790578, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> INK_BENDY_SPAWN_EGG = REGISTRY.register("ink_bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.INK_BENDY, -15724785, -21220, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SAMMY_LAWRENCE_SPAWN_EGG = REGISTRY.register("sammy_lawrence_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.SAMMY_LAWRENCE, -16579837, -3365807, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> CUTOUT_SINNY = REGISTRY.register(BendymodModBlocks.CUTOUT_SINNY.getId().getPath(), () -> new CutoutSinnyDisplayItem(BendymodModBlocks.CUTOUT_SINNY.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CURTAIN_RAGGETY = block(BendymodModBlocks.CURTAIN_RAGGETY, BendymodModTabs.TAB_BENDY_PROPS);
	public static final RegistryObject<Item> RECORDING_SIGN_OFF = REGISTRY.register(BendymodModBlocks.RECORDING_SIGN_OFF.getId().getPath(),
			() -> new RecordingSignOffDisplayItem(BendymodModBlocks.RECORDING_SIGN_OFF.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_BLOCKS)));
	public static final RegistryObject<Item> RECORDING_SIGN_ON = REGISTRY.register(BendymodModBlocks.RECORDING_SIGN_ON.getId().getPath(),
			() -> new RecordingSignOnDisplayItem(BendymodModBlocks.RECORDING_SIGN_ON.get(), new Item.Properties().tab(null)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

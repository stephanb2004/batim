
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BendymodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BendymodMod.MODID);
	public static final RegistryObject<CreativeModeTab> BENDY_BLOCKS = REGISTRY.register("bendy_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bendymod.bendy_blocks")).icon(() -> new ItemStack(BendymodModBlocks.STUDIO_FLOOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BLANK_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BLANK_WALL_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BLANK_WALL_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_PLANKED_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_PLANKED_WALL_BROKEN.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_CEILING.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_DOOR_BASIC.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_DOOR_SEGMENTED.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BROKEN_FLOOR.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_TILED_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_DIRT.get().asItem());
				tabData.accept(BendymodModBlocks.CHAIN_FENCE.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BLANK_WALL_FENCE.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_FENCE.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BRICKS.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BRICK_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_BRICK_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.PLANKED_TRAPDOOR.get().asItem());
				tabData.accept(BendymodModBlocks.SOLID_INK.get().asItem());
				tabData.accept(BendymodModBlocks.STIFF_STUDIO_DOOR_BASIC.get().asItem());
				tabData.accept(BendymodModBlocks.STIFF_STUDIO_DOOR_SEGMENTED.get().asItem());
				tabData.accept(BendymodModBlocks.HEAVY_GATE_CLOSED.get().asItem());
				tabData.accept(BendymodModBlocks.SOLID_INK_RL.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_TILED.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_TILED_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_FLOOR_TILED_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_FLOOR.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_FLOOR_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_FLOOR_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_BLANK_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_BLANK_WALL_STAIRS.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_BLANK_WALL_SLAB.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_PLANKED_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_CEILING.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_TILED_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_SOLID_INK.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_TILES.get().asItem());
				tabData.accept(BendymodModBlocks.WALKABLE_STUDIO_TILES.get().asItem());
				tabData.accept(BendymodModBlocks.INK_LAYER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BENDY_ENTITIES = REGISTRY.register("bendy_entities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bendymod.bendy_entities")).icon(() -> new ItemStack(BendymodModItems.BENDY_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BendymodModItems.BENDY_SPAWN_EGG.get());
				tabData.accept(BendymodModItems.SAMMY_LAWRENCE_SPAWN_EGG.get());
				tabData.accept(BendymodModItems.INK_BENDY_SPAWN_EGG.get());
				tabData.accept(BendymodModItems.SEARCHER_SPAWN_EGG.get());
				tabData.accept(BendymodModItems.BORIS_BUDDY_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BENDY_PROPS = REGISTRY.register("bendy_props",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bendymod.bendy_props")).icon(() -> new ItemStack(BendymodModItems.STUDIO_AXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BendymodModItems.STUDIO_AXE.get());
				tabData.accept(BendymodModBlocks.CUTOUT_BENDY.get().asItem());
				tabData.accept(BendymodModBlocks.INK_MACHINE.get().asItem());
				tabData.accept(BendymodModBlocks.SPEAKER.get().asItem());
				tabData.accept(BendymodModBlocks.DRESSER.get().asItem());
				tabData.accept(BendymodModBlocks.VALVE.get().asItem());
				tabData.accept(BendymodModBlocks.RECORD.get().asItem());
				tabData.accept(BendymodModBlocks.TRASH_BIN.get().asItem());
				tabData.accept(BendymodModBlocks.JUMBLED_PAPER.get().asItem());
				tabData.accept(BendymodModBlocks.BOARDS.get().asItem());
				tabData.accept(BendymodModBlocks.RADIO.get().asItem());
				tabData.accept(BendymodModBlocks.CASSETTE_PLAYER.get().asItem());
				tabData.accept(BendymodModBlocks.DESK.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_CHAIR.get().asItem());
				tabData.accept(BendymodModBlocks.PROJECTOR.get().asItem());
				tabData.accept(BendymodModBlocks.BORIS_CLONE.get().asItem());
				tabData.accept(BendymodModBlocks.INK_PUDDLE.get().asItem());
				tabData.accept(BendymodModBlocks.STUDIO_LAMP.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_STATUE.get().asItem());
				tabData.accept(BendymodModBlocks.INK_BARREL.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LITTLE_DEVIL_DARLIN.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_DANCING_DEMON.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_SHEEP_SONGS.get().asItem());
				tabData.accept(BendymodModBlocks.COFFIN.get().asItem());
				tabData.accept(BendymodModItems.INK_BUCKET.get());
				tabData.accept(BendymodModBlocks.WRITING_DREAMS_COME_TRUE.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_WHOS_LAUGHING_NOW.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_THE_CREATOR_LIED_TO_US.get().asItem());
				tabData.accept(BendymodModBlocks.REEL.get().asItem());
				tabData.accept(BendymodModBlocks.SOUP_CANDLE.get().asItem());
				tabData.accept(BendymodModBlocks.CRATE.get().asItem());
				tabData.accept(BendymodModBlocks.INK_PUDDLE_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.RITUAL_SUMMONING.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_LITTLE_DEVIL_DARLIN.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_DANCING_DEMON.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_SHEEP_SONGS.get().asItem());
				tabData.accept(BendymodModBlocks.SIGN_LIGHT.get().asItem());
				tabData.accept(BendymodModBlocks.SIGN_DARK.get().asItem());
				tabData.accept(BendymodModBlocks.DESK_FANCY.get().asItem());
				tabData.accept(BendymodModBlocks.SHELF.get().asItem());
				tabData.accept(BendymodModBlocks.JDS_SIGN.get().asItem());
				tabData.accept(BendymodModBlocks.WORK_TABLE.get().asItem());
				tabData.accept(BendymodModBlocks.MUSIC_DEPARTMENT_SIGN.get().asItem());
				tabData.accept(BendymodModBlocks.PIPE_STRAIGHT.get().asItem());
				tabData.accept(BendymodModBlocks.PIPE_WALL_VERTICAL.get().asItem());
				tabData.accept(BendymodModBlocks.PIPE_WALL_HORIZONTAL.get().asItem());
				tabData.accept(BendymodModBlocks.GEARBOX.get().asItem());
				tabData.accept(BendymodModBlocks.TOOLBOX.get().asItem());
				tabData.accept(BendymodModBlocks.VENT_COVER.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_ITS_TIME_TO_BELIEVE.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_SING_WITH_ME.get().asItem());
				tabData.accept(BendymodModBlocks.WRITING_DOWN_HERE_WERE_ALL_SINNERS.get().asItem());
				tabData.accept(BendymodModBlocks.HAT_RACK.get().asItem());
				tabData.accept(BendymodModBlocks.CURTAIN_RAGGETY.get().asItem());
				tabData.accept(BendymodModBlocks.RECORDING_SIGN_OFF.get().asItem());
				tabData.accept(BendymodModBlocks.PUNCH_IN_CARD.get().asItem());
				tabData.accept(BendymodModBlocks.PEDESTAL.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_DONT_FORGET_TO_PUNCH_IN.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_DONT_FORGET_TO_PUNCH_IN.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_DELICIOUS.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_DELICIOUS.get().asItem());
				tabData.accept(BendymodModBlocks.CELLBOX_0.get().asItem());
				tabData.accept(BendymodModItems.DRY_CELL.get());
				tabData.accept(BendymodModBlocks.INFERMARY_BED.get().asItem());
				tabData.accept(BendymodModBlocks.INKWELL.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_DOLL.get().asItem());
				tabData.accept(BendymodModBlocks.WRENCH.get().asItem());
				tabData.accept(BendymodModBlocks.ILLUSION_OF_LIVING.get().asItem());
				tabData.accept(BendymodModBlocks.HANGING_MIC.get().asItem());
				tabData.accept(BendymodModBlocks.SHEET_HOLDER.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_HEAD.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_WALL.get().asItem());
				tabData.accept(BendymodModBlocks.BANJO.get().asItem());
				tabData.accept(BendymodModBlocks.DRUM.get().asItem());
				tabData.accept(BendymodModBlocks.PIANO.get().asItem());
				tabData.accept(BendymodModBlocks.BASS.get().asItem());
				tabData.accept(BendymodModBlocks.VIOLIN.get().asItem());
				tabData.accept(BendymodModBlocks.LARGE_BOX.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_WORK_HARD_WORK_HAPPY.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_TRAIN_TROUBLE.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_TRAIN_TROUBLE.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_SENT_FROM_ABOVE.get().asItem());
				tabData.accept(BendymodModBlocks.POSTER_LARGE_SENT_FROM_ABOVE.get().asItem());
				tabData.accept(BendymodModBlocks.INK_PUDDLE_SPAWNER.get().asItem());
				tabData.accept(BendymodModItems.BACON_SOUP.get());
				tabData.accept(BendymodModBlocks.PAINTING_BENDY_UMBRELLA.get().asItem());
				tabData.accept(BendymodModBlocks.LEVER_STUDIO_OFF.get().asItem());
				tabData.accept(BendymodModBlocks.LEVER_POWER_OFF.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_BLANK.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_BOOK.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_COG.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_INKWELL.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_MUSIC.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_PLUSH.get().asItem());
				tabData.accept(BendymodModBlocks.PAINTING_WRENCH.get().asItem());
				tabData.accept(BendymodModBlocks.LARGE_CHAINS.get().asItem());
				tabData.accept(BendymodModItems.BENDY_MASK_HELMET.get());
				tabData.accept(BendymodModBlocks.RECORD_RL.get().asItem());
				tabData.accept(BendymodModBlocks.INKWELL_RL.get().asItem());
				tabData.accept(BendymodModBlocks.GEAR.get().asItem());
				tabData.accept(BendymodModBlocks.GEAR_RL.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_DOLL_RL.get().asItem());
				tabData.accept(BendymodModBlocks.WRENCH_RL.get().asItem());
				tabData.accept(BendymodModBlocks.ILLUSION_OF_LIVING_RL.get().asItem());
				tabData.accept(BendymodModBlocks.PEDESTAL_RL.get().asItem());
				tabData.accept(BendymodModBlocks.INK_MACHINE_RL.get().asItem());
				tabData.accept(BendymodModBlocks.BOOK_BENDY.get().asItem());
				tabData.accept(BendymodModBlocks.BENDY_BOOK_STACK.get().asItem());
				tabData.accept(BendymodModBlocks.REEL_BENDY_DANCE.get().asItem());
				tabData.accept(BendymodModBlocks.TABLE.get().asItem());
				tabData.accept(BendymodModBlocks.TABLE_BIG.get().asItem());
				tabData.accept(BendymodModBlocks.WALL_GASH_1.get().asItem());
				tabData.accept(BendymodModBlocks.CUTOUT_BENDY_DIAG.get().asItem());
				tabData.accept(BendymodModBlocks.DESK_OLD.get().asItem());
				tabData.accept(BendymodModBlocks.PLANK_SHELF.get().asItem());
				tabData.accept(BendymodModBlocks.PLANK.get().asItem());
				tabData.accept(BendymodModBlocks.STOOL.get().asItem());
				tabData.accept(BendymodModItems.BACON_SOUP_EMPTY.get());
				tabData.accept(BendymodModBlocks.LITTLE_MIRACLE_STATION.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BendymodModBlocks.CUTOUT_SINNY.get().asItem());
			tabData.accept(BendymodModBlocks.RECORDING_SIGN_ON.get().asItem());
			tabData.accept(BendymodModBlocks.CELLBOX_1.get().asItem());
			tabData.accept(BendymodModBlocks.CELLBOX_2.get().asItem());
			tabData.accept(BendymodModBlocks.HEAVY_GATE_OPEN.get().asItem());
			tabData.accept(BendymodModBlocks.LEVER_STUDIO_ON.get().asItem());
			tabData.accept(BendymodModBlocks.LEVER_POWER_ON.get().asItem());
			tabData.accept(BendymodModBlocks.PEDESTAL_ON.get().asItem());
			tabData.accept(BendymodModBlocks.PEDESTAL_RL_ON.get().asItem());
			tabData.accept(BendymodModBlocks.PROJECTION_BLANK.get().asItem());
			tabData.accept(BendymodModBlocks.PROJECTION_BENDY_DANCE.get().asItem());
			tabData.accept(BendymodModBlocks.CUTOUT_SINNY_DIAG.get().asItem());
		}
	}
}

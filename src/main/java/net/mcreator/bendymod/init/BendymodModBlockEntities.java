
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.entity.WritingWhosLaughingNowTileEntity;
import net.mcreator.bendymod.block.entity.WritingTheSheepWillComeToSlaughterTileEntity;
import net.mcreator.bendymod.block.entity.WritingTheCreatorLiedToUsTileEntity;
import net.mcreator.bendymod.block.entity.WritingSingWithMeTileEntity;
import net.mcreator.bendymod.block.entity.WritingItsTimeToBelieveTileEntity;
import net.mcreator.bendymod.block.entity.WritingDreamsComeTrueTileEntity;
import net.mcreator.bendymod.block.entity.WritingDownHereWereAllSinnersTileEntity;
import net.mcreator.bendymod.block.entity.WrenchTileEntity;
import net.mcreator.bendymod.block.entity.WorkTableTileEntity;
import net.mcreator.bendymod.block.entity.ViolinTileEntity;
import net.mcreator.bendymod.block.entity.ValveTileEntity;
import net.mcreator.bendymod.block.entity.TrashBinTileEntity;
import net.mcreator.bendymod.block.entity.ToolboxTileEntity;
import net.mcreator.bendymod.block.entity.StudioChairTileEntity;
import net.mcreator.bendymod.block.entity.SpeakerTileEntity;
import net.mcreator.bendymod.block.entity.SoupCandleTileEntity;
import net.mcreator.bendymod.block.entity.ShelfTileEntity;
import net.mcreator.bendymod.block.entity.SheetHolderTileEntity;
import net.mcreator.bendymod.block.entity.ReelTileEntity;
import net.mcreator.bendymod.block.entity.RecordingSignOnTileEntity;
import net.mcreator.bendymod.block.entity.RecordingSignOffTileEntity;
import net.mcreator.bendymod.block.entity.RecordTileEntity;
import net.mcreator.bendymod.block.entity.RadioTileEntity;
import net.mcreator.bendymod.block.entity.PunchInCardTileEntity;
import net.mcreator.bendymod.block.entity.ProjectorTileEntity;
import net.mcreator.bendymod.block.entity.PianoTileEntity;
import net.mcreator.bendymod.block.entity.PedestalTileEntity;
import net.mcreator.bendymod.block.entity.MusicDepartmentSignTileEntity;
import net.mcreator.bendymod.block.entity.LeverStudioTileEntity;
import net.mcreator.bendymod.block.entity.LeverPowerTileEntity;
import net.mcreator.bendymod.block.entity.LargeBoxTileEntity;
import net.mcreator.bendymod.block.entity.JumbledPaperTileEntity;
import net.mcreator.bendymod.block.entity.JDSSignTileEntity;
import net.mcreator.bendymod.block.entity.InkPuddleSpawnerBlockEntity;
import net.mcreator.bendymod.block.entity.InkMachineTileEntity;
import net.mcreator.bendymod.block.entity.InkBarrelTileEntity;
import net.mcreator.bendymod.block.entity.InfermaryBedTileEntity;
import net.mcreator.bendymod.block.entity.IllusionOfLivingTileEntity;
import net.mcreator.bendymod.block.entity.HatRackTileEntity;
import net.mcreator.bendymod.block.entity.HangingMicTileEntity;
import net.mcreator.bendymod.block.entity.GearboxTileEntity;
import net.mcreator.bendymod.block.entity.DrumTileEntity;
import net.mcreator.bendymod.block.entity.DresserTileEntity;
import net.mcreator.bendymod.block.entity.DeskTileEntity;
import net.mcreator.bendymod.block.entity.DeskFancyTileEntity;
import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;
import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;
import net.mcreator.bendymod.block.entity.CrateBlockEntity;
import net.mcreator.bendymod.block.entity.CoffinTileEntity;
import net.mcreator.bendymod.block.entity.Cellbox2TileEntity;
import net.mcreator.bendymod.block.entity.Cellbox1TileEntity;
import net.mcreator.bendymod.block.entity.Cellbox0TileEntity;
import net.mcreator.bendymod.block.entity.CassettePlayerTileEntity;
import net.mcreator.bendymod.block.entity.BorisCloneTileEntity;
import net.mcreator.bendymod.block.entity.BoardsTileEntity;
import net.mcreator.bendymod.block.entity.BendyStatueTileEntity;
import net.mcreator.bendymod.block.entity.BendyDollTileEntity;
import net.mcreator.bendymod.block.entity.BassTileEntity;
import net.mcreator.bendymod.block.entity.BanjoTileEntity;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BendymodMod.MODID);
	public static final RegistryObject<BlockEntityType<HangingMicTileEntity>> HANGING_MIC = REGISTRY.register("hanging_mic", () -> BlockEntityType.Builder.of(HangingMicTileEntity::new, BendymodModBlocks.HANGING_MIC.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> CRATE = register("crate", BendymodModBlocks.CRATE, CrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<SoupCandleTileEntity>> SOUP_CANDLE = REGISTRY.register("soup_candle", () -> BlockEntityType.Builder.of(SoupCandleTileEntity::new, BendymodModBlocks.SOUP_CANDLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutBendyTileEntity>> CUTOUT_BENDY = REGISTRY.register("cutout_bendy", () -> BlockEntityType.Builder.of(CutoutBendyTileEntity::new, BendymodModBlocks.CUTOUT_BENDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ProjectorTileEntity>> PROJECTOR = REGISTRY.register("projector", () -> BlockEntityType.Builder.of(ProjectorTileEntity::new, BendymodModBlocks.PROJECTOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeskTileEntity>> DESK = REGISTRY.register("desk", () -> BlockEntityType.Builder.of(DeskTileEntity::new, BendymodModBlocks.DESK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeskFancyTileEntity>> DESK_FANCY = REGISTRY.register("desk_fancy", () -> BlockEntityType.Builder.of(DeskFancyTileEntity::new, BendymodModBlocks.DESK_FANCY.get()).build(null));
	public static final RegistryObject<BlockEntityType<WorkTableTileEntity>> WORK_TABLE = REGISTRY.register("work_table", () -> BlockEntityType.Builder.of(WorkTableTileEntity::new, BendymodModBlocks.WORK_TABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShelfTileEntity>> SHELF = REGISTRY.register("shelf", () -> BlockEntityType.Builder.of(ShelfTileEntity::new, BendymodModBlocks.SHELF.get()).build(null));
	public static final RegistryObject<BlockEntityType<StudioChairTileEntity>> STUDIO_CHAIR = REGISTRY.register("studio_chair", () -> BlockEntityType.Builder.of(StudioChairTileEntity::new, BendymodModBlocks.STUDIO_CHAIR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DresserTileEntity>> DRESSER = REGISTRY.register("dresser", () -> BlockEntityType.Builder.of(DresserTileEntity::new, BendymodModBlocks.DRESSER.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkBarrelTileEntity>> INK_BARREL = REGISTRY.register("ink_barrel", () -> BlockEntityType.Builder.of(InkBarrelTileEntity::new, BendymodModBlocks.INK_BARREL.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBinTileEntity>> TRASH_BIN = REGISTRY.register("trash_bin", () -> BlockEntityType.Builder.of(TrashBinTileEntity::new, BendymodModBlocks.TRASH_BIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<RadioTileEntity>> RADIO = REGISTRY.register("radio", () -> BlockEntityType.Builder.of(RadioTileEntity::new, BendymodModBlocks.RADIO.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpeakerTileEntity>> SPEAKER = REGISTRY.register("speaker", () -> BlockEntityType.Builder.of(SpeakerTileEntity::new, BendymodModBlocks.SPEAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<CassettePlayerTileEntity>> CASSETTE_PLAYER = REGISTRY.register("cassette_player",
			() -> BlockEntityType.Builder.of(CassettePlayerTileEntity::new, BendymodModBlocks.CASSETTE_PLAYER.get()).build(null));
	public static final RegistryObject<BlockEntityType<LeverPowerTileEntity>> LEVER_POWER = REGISTRY.register("lever_power", () -> BlockEntityType.Builder.of(LeverPowerTileEntity::new, BendymodModBlocks.LEVER_POWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<LeverStudioTileEntity>> LEVER_STUDIO = REGISTRY.register("lever_studio", () -> BlockEntityType.Builder.of(LeverStudioTileEntity::new, BendymodModBlocks.LEVER_STUDIO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ValveTileEntity>> VALVE = REGISTRY.register("valve", () -> BlockEntityType.Builder.of(ValveTileEntity::new, BendymodModBlocks.VALVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<LargeBoxTileEntity>> LARGE_BOX = REGISTRY.register("large_box", () -> BlockEntityType.Builder.of(LargeBoxTileEntity::new, BendymodModBlocks.LARGE_BOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkMachineTileEntity>> INK_MACHINE = REGISTRY.register("ink_machine", () -> BlockEntityType.Builder.of(InkMachineTileEntity::new, BendymodModBlocks.INK_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<JumbledPaperTileEntity>> JUMBLED_PAPER = REGISTRY.register("jumbled_paper", () -> BlockEntityType.Builder.of(JumbledPaperTileEntity::new, BendymodModBlocks.JUMBLED_PAPER.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoardsTileEntity>> BOARDS = REGISTRY.register("boards", () -> BlockEntityType.Builder.of(BoardsTileEntity::new, BendymodModBlocks.BOARDS.get()).build(null));
	public static final RegistryObject<BlockEntityType<BorisCloneTileEntity>> BORIS_CLONE = REGISTRY.register("boris_clone", () -> BlockEntityType.Builder.of(BorisCloneTileEntity::new, BendymodModBlocks.BORIS_CLONE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BendyStatueTileEntity>> BENDY_STATUE = REGISTRY.register("bendy_statue", () -> BlockEntityType.Builder.of(BendyStatueTileEntity::new, BendymodModBlocks.BENDY_STATUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CoffinTileEntity>> COFFIN = REGISTRY.register("coffin", () -> BlockEntityType.Builder.of(CoffinTileEntity::new, BendymodModBlocks.COFFIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<ReelTileEntity>> REEL = REGISTRY.register("reel", () -> BlockEntityType.Builder.of(ReelTileEntity::new, BendymodModBlocks.REEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<JDSSignTileEntity>> JDS_SIGN = REGISTRY.register("jds_sign", () -> BlockEntityType.Builder.of(JDSSignTileEntity::new, BendymodModBlocks.JDS_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<MusicDepartmentSignTileEntity>> MUSIC_DEPARTMENT_SIGN = REGISTRY.register("music_department_sign",
			() -> BlockEntityType.Builder.of(MusicDepartmentSignTileEntity::new, BendymodModBlocks.MUSIC_DEPARTMENT_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<RecordingSignOffTileEntity>> RECORDING_SIGN_OFF = REGISTRY.register("recording_sign_off",
			() -> BlockEntityType.Builder.of(RecordingSignOffTileEntity::new, BendymodModBlocks.RECORDING_SIGN_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<GearboxTileEntity>> GEARBOX = REGISTRY.register("gearbox", () -> BlockEntityType.Builder.of(GearboxTileEntity::new, BendymodModBlocks.GEARBOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToolboxTileEntity>> TOOLBOX = REGISTRY.register("toolbox", () -> BlockEntityType.Builder.of(ToolboxTileEntity::new, BendymodModBlocks.TOOLBOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<HatRackTileEntity>> HAT_RACK = REGISTRY.register("hat_rack", () -> BlockEntityType.Builder.of(HatRackTileEntity::new, BendymodModBlocks.HAT_RACK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PunchInCardTileEntity>> PUNCH_IN_CARD = REGISTRY.register("punch_in_card", () -> BlockEntityType.Builder.of(PunchInCardTileEntity::new, BendymodModBlocks.PUNCH_IN_CARD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Cellbox0TileEntity>> CELLBOX_0 = REGISTRY.register("cellbox_0", () -> BlockEntityType.Builder.of(Cellbox0TileEntity::new, BendymodModBlocks.CELLBOX_0.get()).build(null));
	public static final RegistryObject<BlockEntityType<InfermaryBedTileEntity>> INFERMARY_BED = REGISTRY.register("infermary_bed", () -> BlockEntityType.Builder.of(InfermaryBedTileEntity::new, BendymodModBlocks.INFERMARY_BED.get()).build(null));
	public static final RegistryObject<BlockEntityType<PedestalTileEntity>> PEDESTAL = REGISTRY.register("pedestal", () -> BlockEntityType.Builder.of(PedestalTileEntity::new, BendymodModBlocks.PEDESTAL.get()).build(null));
	public static final RegistryObject<BlockEntityType<RecordTileEntity>> RECORD = REGISTRY.register("record", () -> BlockEntityType.Builder.of(RecordTileEntity::new, BendymodModBlocks.RECORD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BendyDollTileEntity>> BENDY_DOLL = REGISTRY.register("bendy_doll", () -> BlockEntityType.Builder.of(BendyDollTileEntity::new, BendymodModBlocks.BENDY_DOLL.get()).build(null));
	public static final RegistryObject<BlockEntityType<WrenchTileEntity>> WRENCH = REGISTRY.register("wrench", () -> BlockEntityType.Builder.of(WrenchTileEntity::new, BendymodModBlocks.WRENCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<IllusionOfLivingTileEntity>> ILLUSION_OF_LIVING = REGISTRY.register("illusion_of_living",
			() -> BlockEntityType.Builder.of(IllusionOfLivingTileEntity::new, BendymodModBlocks.ILLUSION_OF_LIVING.get()).build(null));
	public static final RegistryObject<BlockEntityType<SheetHolderTileEntity>> SHEET_HOLDER = REGISTRY.register("sheet_holder", () -> BlockEntityType.Builder.of(SheetHolderTileEntity::new, BendymodModBlocks.SHEET_HOLDER.get()).build(null));
	public static final RegistryObject<BlockEntityType<BanjoTileEntity>> BANJO = REGISTRY.register("banjo", () -> BlockEntityType.Builder.of(BanjoTileEntity::new, BendymodModBlocks.BANJO.get()).build(null));
	public static final RegistryObject<BlockEntityType<DrumTileEntity>> DRUM = REGISTRY.register("drum", () -> BlockEntityType.Builder.of(DrumTileEntity::new, BendymodModBlocks.DRUM.get()).build(null));
	public static final RegistryObject<BlockEntityType<PianoTileEntity>> PIANO = REGISTRY.register("piano", () -> BlockEntityType.Builder.of(PianoTileEntity::new, BendymodModBlocks.PIANO.get()).build(null));
	public static final RegistryObject<BlockEntityType<BassTileEntity>> BASS = REGISTRY.register("bass", () -> BlockEntityType.Builder.of(BassTileEntity::new, BendymodModBlocks.BASS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ViolinTileEntity>> VIOLIN = REGISTRY.register("violin", () -> BlockEntityType.Builder.of(ViolinTileEntity::new, BendymodModBlocks.VIOLIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingDreamsComeTrueTileEntity>> WRITING_DREAMS_COME_TRUE = REGISTRY.register("writing_dreams_come_true",
			() -> BlockEntityType.Builder.of(WritingDreamsComeTrueTileEntity::new, BendymodModBlocks.WRITING_DREAMS_COME_TRUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingWhosLaughingNowTileEntity>> WRITING_WHOS_LAUGHING_NOW = REGISTRY.register("writing_whos_laughing_now",
			() -> BlockEntityType.Builder.of(WritingWhosLaughingNowTileEntity::new, BendymodModBlocks.WRITING_WHOS_LAUGHING_NOW.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingTheCreatorLiedToUsTileEntity>> WRITING_THE_CREATOR_LIED_TO_US = REGISTRY.register("writing_the_creator_lied_to_us",
			() -> BlockEntityType.Builder.of(WritingTheCreatorLiedToUsTileEntity::new, BendymodModBlocks.WRITING_THE_CREATOR_LIED_TO_US.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingItsTimeToBelieveTileEntity>> WRITING_ITS_TIME_TO_BELIEVE = REGISTRY.register("writing_its_time_to_believe",
			() -> BlockEntityType.Builder.of(WritingItsTimeToBelieveTileEntity::new, BendymodModBlocks.WRITING_ITS_TIME_TO_BELIEVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingTheSheepWillComeToSlaughterTileEntity>> WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER = REGISTRY.register("writing_the_sheep_will_come_to_slaughter",
			() -> BlockEntityType.Builder.of(WritingTheSheepWillComeToSlaughterTileEntity::new, BendymodModBlocks.WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingSingWithMeTileEntity>> WRITING_SING_WITH_ME = REGISTRY.register("writing_sing_with_me",
			() -> BlockEntityType.Builder.of(WritingSingWithMeTileEntity::new, BendymodModBlocks.WRITING_SING_WITH_ME.get()).build(null));
	public static final RegistryObject<BlockEntityType<WritingDownHereWereAllSinnersTileEntity>> WRITING_DOWN_HERE_WERE_ALL_SINNERS = REGISTRY.register("writing_down_here_were_all_sinners",
			() -> BlockEntityType.Builder.of(WritingDownHereWereAllSinnersTileEntity::new, BendymodModBlocks.WRITING_DOWN_HERE_WERE_ALL_SINNERS.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutSinnyTileEntity>> CUTOUT_SINNY = REGISTRY.register("cutout_sinny", () -> BlockEntityType.Builder.of(CutoutSinnyTileEntity::new, BendymodModBlocks.CUTOUT_SINNY.get()).build(null));
	public static final RegistryObject<BlockEntityType<RecordingSignOnTileEntity>> RECORDING_SIGN_ON = REGISTRY.register("recording_sign_on",
			() -> BlockEntityType.Builder.of(RecordingSignOnTileEntity::new, BendymodModBlocks.RECORDING_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<Cellbox1TileEntity>> CELLBOX_1 = REGISTRY.register("cellbox_1", () -> BlockEntityType.Builder.of(Cellbox1TileEntity::new, BendymodModBlocks.CELLBOX_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Cellbox2TileEntity>> CELLBOX_2 = REGISTRY.register("cellbox_2", () -> BlockEntityType.Builder.of(Cellbox2TileEntity::new, BendymodModBlocks.CELLBOX_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> INK_PUDDLE_SPAWNER = register("ink_puddle_spawner", BendymodModBlocks.INK_PUDDLE_SPAWNER, InkPuddleSpawnerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

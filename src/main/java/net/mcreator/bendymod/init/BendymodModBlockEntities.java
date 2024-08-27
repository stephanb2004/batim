
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.entity.ValveTileEntity;
import net.mcreator.bendymod.block.entity.TrashBinTileEntity;
import net.mcreator.bendymod.block.entity.StudioLampTileEntity;
import net.mcreator.bendymod.block.entity.SpeakerTileEntity;
import net.mcreator.bendymod.block.entity.RecordTileEntity;
import net.mcreator.bendymod.block.entity.RadioTileEntity;
import net.mcreator.bendymod.block.entity.LeverStudioTileEntity;
import net.mcreator.bendymod.block.entity.LeverPowerTileEntity;
import net.mcreator.bendymod.block.entity.JumbledPaperTileEntity;
import net.mcreator.bendymod.block.entity.InkPipeVerticalTileEntity;
import net.mcreator.bendymod.block.entity.InkPipeStraightTileEntity;
import net.mcreator.bendymod.block.entity.InkPipeHorizontalTileEntity;
import net.mcreator.bendymod.block.entity.InkMachineTileEntity;
import net.mcreator.bendymod.block.entity.DresserTileEntity;
import net.mcreator.bendymod.block.entity.DeskTileEntity;
import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;
import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;
import net.mcreator.bendymod.block.entity.CassettePlayerTileEntity;
import net.mcreator.bendymod.block.entity.BoardsTileEntity;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BendymodMod.MODID);
	public static final RegistryObject<BlockEntityType<CutoutBendyTileEntity>> CUTOUT_BENDY = REGISTRY.register("cutout_bendy", () -> BlockEntityType.Builder.of(CutoutBendyTileEntity::new, BendymodModBlocks.CUTOUT_BENDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutSinnyTileEntity>> CUTOUT_SINNY = REGISTRY.register("cutout_sinny", () -> BlockEntityType.Builder.of(CutoutSinnyTileEntity::new, BendymodModBlocks.CUTOUT_SINNY.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkMachineTileEntity>> INK_MACHINE = REGISTRY.register("ink_machine", () -> BlockEntityType.Builder.of(InkMachineTileEntity::new, BendymodModBlocks.INK_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpeakerTileEntity>> SPEAKER = REGISTRY.register("speaker", () -> BlockEntityType.Builder.of(SpeakerTileEntity::new, BendymodModBlocks.SPEAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<StudioLampTileEntity>> STUDIO_LAMP = REGISTRY.register("studio_lamp", () -> BlockEntityType.Builder.of(StudioLampTileEntity::new, BendymodModBlocks.STUDIO_LAMP.get()).build(null));
	public static final RegistryObject<BlockEntityType<DresserTileEntity>> DRESSER = REGISTRY.register("dresser", () -> BlockEntityType.Builder.of(DresserTileEntity::new, BendymodModBlocks.DRESSER.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkPipeHorizontalTileEntity>> INK_PIPE_HORIZONTAL = REGISTRY.register("ink_pipe_horizontal",
			() -> BlockEntityType.Builder.of(InkPipeHorizontalTileEntity::new, BendymodModBlocks.INK_PIPE_HORIZONTAL.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkPipeVerticalTileEntity>> INK_PIPE_VERTICAL = REGISTRY.register("ink_pipe_vertical",
			() -> BlockEntityType.Builder.of(InkPipeVerticalTileEntity::new, BendymodModBlocks.INK_PIPE_VERTICAL.get()).build(null));
	public static final RegistryObject<BlockEntityType<InkPipeStraightTileEntity>> INK_PIPE_STRAIGHT = REGISTRY.register("ink_pipe_straight",
			() -> BlockEntityType.Builder.of(InkPipeStraightTileEntity::new, BendymodModBlocks.INK_PIPE_STRAIGHT.get()).build(null));
	public static final RegistryObject<BlockEntityType<LeverPowerTileEntity>> LEVER_POWER = REGISTRY.register("lever_power", () -> BlockEntityType.Builder.of(LeverPowerTileEntity::new, BendymodModBlocks.LEVER_POWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<LeverStudioTileEntity>> LEVER_STUDIO = REGISTRY.register("lever_studio", () -> BlockEntityType.Builder.of(LeverStudioTileEntity::new, BendymodModBlocks.LEVER_STUDIO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ValveTileEntity>> VALVE = REGISTRY.register("valve", () -> BlockEntityType.Builder.of(ValveTileEntity::new, BendymodModBlocks.VALVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<RecordTileEntity>> RECORD = REGISTRY.register("record", () -> BlockEntityType.Builder.of(RecordTileEntity::new, BendymodModBlocks.RECORD.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBinTileEntity>> TRASH_BIN = REGISTRY.register("trash_bin", () -> BlockEntityType.Builder.of(TrashBinTileEntity::new, BendymodModBlocks.TRASH_BIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<JumbledPaperTileEntity>> JUMBLED_PAPER = REGISTRY.register("jumbled_paper", () -> BlockEntityType.Builder.of(JumbledPaperTileEntity::new, BendymodModBlocks.JUMBLED_PAPER.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoardsTileEntity>> BOARDS = REGISTRY.register("boards", () -> BlockEntityType.Builder.of(BoardsTileEntity::new, BendymodModBlocks.BOARDS.get()).build(null));
	public static final RegistryObject<BlockEntityType<RadioTileEntity>> RADIO = REGISTRY.register("radio", () -> BlockEntityType.Builder.of(RadioTileEntity::new, BendymodModBlocks.RADIO.get()).build(null));
	public static final RegistryObject<BlockEntityType<CassettePlayerTileEntity>> CASSETTE_PLAYER = REGISTRY.register("cassette_player",
			() -> BlockEntityType.Builder.of(CassettePlayerTileEntity::new, BendymodModBlocks.CASSETTE_PLAYER.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeskTileEntity>> DESK = REGISTRY.register("desk", () -> BlockEntityType.Builder.of(DeskTileEntity::new, BendymodModBlocks.DESK.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

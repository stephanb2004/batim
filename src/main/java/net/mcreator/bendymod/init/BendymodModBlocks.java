
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.ValveBlock;
import net.mcreator.bendymod.block.TrashBinBlock;
import net.mcreator.bendymod.block.StudioPlankedWallBrokenBlock;
import net.mcreator.bendymod.block.StudioPlankedWallBlock;
import net.mcreator.bendymod.block.StudioLampBlock;
import net.mcreator.bendymod.block.StudioFloorStairsBlock;
import net.mcreator.bendymod.block.StudioFloorSlabBlock;
import net.mcreator.bendymod.block.StudioFloorBlock;
import net.mcreator.bendymod.block.StudioDoorSegmentedBlock;
import net.mcreator.bendymod.block.StudioDoorBasicBlock;
import net.mcreator.bendymod.block.StudioCeilingBlock;
import net.mcreator.bendymod.block.StudioBlankWallStairsBlock;
import net.mcreator.bendymod.block.StudioBlankWallSlabBlock;
import net.mcreator.bendymod.block.StudioBlankWallBlock;
import net.mcreator.bendymod.block.SpeakerBlock;
import net.mcreator.bendymod.block.RecordBlock;
import net.mcreator.bendymod.block.RadioBlock;
import net.mcreator.bendymod.block.LeverStudioBlock;
import net.mcreator.bendymod.block.LeverPowerBlock;
import net.mcreator.bendymod.block.JumbledPaperBlock;
import net.mcreator.bendymod.block.InkPipeVerticalBlock;
import net.mcreator.bendymod.block.InkPipeStraightBlock;
import net.mcreator.bendymod.block.InkPipeHorizontalBlock;
import net.mcreator.bendymod.block.InkMachineBlock;
import net.mcreator.bendymod.block.DresserBlock;
import net.mcreator.bendymod.block.DeskBlock;
import net.mcreator.bendymod.block.CutoutSinnyBlock;
import net.mcreator.bendymod.block.CutoutBendyBlock;
import net.mcreator.bendymod.block.CassettePlayerBlock;
import net.mcreator.bendymod.block.BoardsBlock;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BendymodMod.MODID);
	public static final RegistryObject<Block> STUDIO_BLANK_WALL = REGISTRY.register("studio_blank_wall", () -> new StudioBlankWallBlock());
	public static final RegistryObject<Block> STUDIO_BLANK_WALL_STAIRS = REGISTRY.register("studio_blank_wall_stairs", () -> new StudioBlankWallStairsBlock());
	public static final RegistryObject<Block> STUDIO_BLANK_WALL_SLAB = REGISTRY.register("studio_blank_wall_slab", () -> new StudioBlankWallSlabBlock());
	public static final RegistryObject<Block> STUDIO_PLANKED_WALL = REGISTRY.register("studio_planked_wall", () -> new StudioPlankedWallBlock());
	public static final RegistryObject<Block> STUDIO_PLANKED_WALL_BROKEN = REGISTRY.register("studio_planked_wall_broken", () -> new StudioPlankedWallBrokenBlock());
	public static final RegistryObject<Block> STUDIO_CEILING = REGISTRY.register("studio_ceiling", () -> new StudioCeilingBlock());
	public static final RegistryObject<Block> STUDIO_FLOOR = REGISTRY.register("studio_floor", () -> new StudioFloorBlock());
	public static final RegistryObject<Block> STUDIO_FLOOR_STAIRS = REGISTRY.register("studio_floor_stairs", () -> new StudioFloorStairsBlock());
	public static final RegistryObject<Block> STUDIO_FLOOR_SLAB = REGISTRY.register("studio_floor_slab", () -> new StudioFloorSlabBlock());
	public static final RegistryObject<Block> CUTOUT_BENDY = REGISTRY.register("cutout_bendy", () -> new CutoutBendyBlock());
	public static final RegistryObject<Block> CUTOUT_SINNY = REGISTRY.register("cutout_sinny", () -> new CutoutSinnyBlock());
	public static final RegistryObject<Block> STUDIO_DOOR_BASIC = REGISTRY.register("studio_door_basic", () -> new StudioDoorBasicBlock());
	public static final RegistryObject<Block> STUDIO_DOOR_SEGMENTED = REGISTRY.register("studio_door_segmented", () -> new StudioDoorSegmentedBlock());
	public static final RegistryObject<Block> INK_MACHINE = REGISTRY.register("ink_machine", () -> new InkMachineBlock());
	public static final RegistryObject<Block> SPEAKER = REGISTRY.register("speaker", () -> new SpeakerBlock());
	public static final RegistryObject<Block> STUDIO_LAMP = REGISTRY.register("studio_lamp", () -> new StudioLampBlock());
	public static final RegistryObject<Block> DRESSER = REGISTRY.register("dresser", () -> new DresserBlock());
	public static final RegistryObject<Block> INK_PIPE_HORIZONTAL = REGISTRY.register("ink_pipe_horizontal", () -> new InkPipeHorizontalBlock());
	public static final RegistryObject<Block> INK_PIPE_VERTICAL = REGISTRY.register("ink_pipe_vertical", () -> new InkPipeVerticalBlock());
	public static final RegistryObject<Block> INK_PIPE_STRAIGHT = REGISTRY.register("ink_pipe_straight", () -> new InkPipeStraightBlock());
	public static final RegistryObject<Block> LEVER_POWER = REGISTRY.register("lever_power", () -> new LeverPowerBlock());
	public static final RegistryObject<Block> LEVER_STUDIO = REGISTRY.register("lever_studio", () -> new LeverStudioBlock());
	public static final RegistryObject<Block> VALVE = REGISTRY.register("valve", () -> new ValveBlock());
	public static final RegistryObject<Block> RECORD = REGISTRY.register("record", () -> new RecordBlock());
	public static final RegistryObject<Block> TRASH_BIN = REGISTRY.register("trash_bin", () -> new TrashBinBlock());
	public static final RegistryObject<Block> JUMBLED_PAPER = REGISTRY.register("jumbled_paper", () -> new JumbledPaperBlock());
	public static final RegistryObject<Block> BOARDS = REGISTRY.register("boards", () -> new BoardsBlock());
	public static final RegistryObject<Block> RADIO = REGISTRY.register("radio", () -> new RadioBlock());
	public static final RegistryObject<Block> CASSETTE_PLAYER = REGISTRY.register("cassette_player", () -> new CassettePlayerBlock());
	public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());
}

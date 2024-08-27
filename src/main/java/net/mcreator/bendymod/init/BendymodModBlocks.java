
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.StudioPlankedWallBrokenBlock;
import net.mcreator.bendymod.block.StudioPlankedWallBlock;
import net.mcreator.bendymod.block.StudioFloorStairsBlock;
import net.mcreator.bendymod.block.StudioFloorSlabBlock;
import net.mcreator.bendymod.block.StudioFloorBlock;
import net.mcreator.bendymod.block.StudioCeilingBlock;
import net.mcreator.bendymod.block.StudioBlankWallStairsBlock;
import net.mcreator.bendymod.block.StudioBlankWallSlabBlock;
import net.mcreator.bendymod.block.StudioBlankWallBlock;
import net.mcreator.bendymod.block.CutoutSinnyBlock;
import net.mcreator.bendymod.block.CutoutBendyBlock;
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
}

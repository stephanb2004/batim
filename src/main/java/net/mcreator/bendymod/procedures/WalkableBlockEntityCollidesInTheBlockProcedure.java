package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.entity.InkBendyEntity;

public class WalkableBlockEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("bendymod:posters")))) {
			if (entity instanceof InkBendyEntity || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("bendymod:butcher_gang")))
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR_STAIRS.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR_SLAB.get()) {
				WalkableDestroyRowProcedure.execute(world, x + 1, y, z);
				WalkableDestroyRowProcedure.execute(world, x - 1, y, z);
				WalkableDestroyRowProcedure.execute(world, x, y, z + 1);
				WalkableDestroyRowProcedure.execute(world, x, y, z - 1);
				WalkableDestroyRowProcedure.execute(world, x + 1, y, z + 1);
				WalkableDestroyRowProcedure.execute(world, x - 1, y, z - 1);
				WalkableDestroyRowProcedure.execute(world, x - 1, y, z + 1);
				WalkableDestroyRowProcedure.execute(world, x + 1, y, z - 1);
				WalkableDestroyRowProcedure.execute(world, x, y, z);
			}
		} else {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("bendymod:butcher_gang")))) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		}
	}
}

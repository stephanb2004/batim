package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.entity.InkBendyEntity;

public class WalkableBlockEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof InkBendyEntity || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR_STAIRS.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.WALKABLE_STUDIO_FLOOR_SLAB.get()) {
			WalkableDestroyRowProcedure.execute(world, (x + 1), y, z);
			WalkableDestroyRowProcedure.execute(world, (x - 1), y, z);
			WalkableDestroyRowProcedure.execute(world, x, y, (z + 1));
			WalkableDestroyRowProcedure.execute(world, x, y, (z - 1));
			WalkableDestroyRowProcedure.execute(world, (x + 1), y, (z + 1));
			WalkableDestroyRowProcedure.execute(world, (x - 1), y, (z - 1));
			WalkableDestroyRowProcedure.execute(world, (x - 1), y, (z + 1));
			WalkableDestroyRowProcedure.execute(world, (x + 1), y, (z - 1));
			WalkableDestroyRowProcedure.execute(world, x, y, z);
		}
	}
}

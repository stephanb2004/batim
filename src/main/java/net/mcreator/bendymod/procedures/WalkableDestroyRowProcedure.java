package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WalkableDestroyRowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("bendymod:walkable_blocks")))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("bendymod:walkable_blocks")))) {
				world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
				if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(new ResourceLocation("bendymod:walkable_blocks")))) {
					world.destroyBlock(BlockPos.containing(x, y + 2, z), false);
				}
			}
		}
	}
}

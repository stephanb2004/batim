package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ButcherGangNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean can_spawn = false;
		if ((y < 288 && y > 224 || y < 208) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			can_spawn = true;
		} else {
			can_spawn = false;
		}
		return can_spawn;
	}
}

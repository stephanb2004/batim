package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.bendymod.network.BendymodModVariables;

public class InkBendyOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world) {
		BendymodModVariables.MapVariables.get(world).ink_bendy_timer = Mth.nextInt(RandomSource.create(), 30000, 78000);
		BendymodModVariables.MapVariables.get(world).syncData(world);
		BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
		BendymodModVariables.MapVariables.get(world).syncData(world);
	}
}

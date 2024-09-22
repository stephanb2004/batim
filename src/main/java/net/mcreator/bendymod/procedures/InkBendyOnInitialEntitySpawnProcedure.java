package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModGameRules;

public class InkBendyOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_INK_BENDYS) == false) {
			if (BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected == false) {
				BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				BendymodModVariables.MapVariables.get(world).ink_bendy_timer = Mth.nextInt(RandomSource.create(), (world.getLevelData().getGameRules().getInt(BendymodModGameRules.INK_DEMON_TIMER_MINIMUM)),
						(world.getLevelData().getGameRules().getInt(BendymodModGameRules.INK_DEMON_TIMER_MAXIMUM)));
				BendymodModVariables.MapVariables.get(world).syncData(world);
				BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected = true;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				entity.getPersistentData().putBoolean("cur_inkbendy", true);
			}
		}
	}
}

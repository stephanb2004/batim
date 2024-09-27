package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModGameRules;

public class ProjectionistOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_PROJECTIONISTS) == false) {
			if (BendymodModVariables.MapVariables.get(world).cur_projectionist_selected == false) {
				BendymodModVariables.MapVariables.get(world).cur_projectionist_selected = true;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				entity.getPersistentData().putBoolean("cur_projectionist", true);
			}
		}
	}
}

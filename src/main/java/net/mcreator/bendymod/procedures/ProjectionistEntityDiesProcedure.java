package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.network.BendymodModVariables;

public class ProjectionistEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("cur_projectionist") == true) {
			BendymodModVariables.MapVariables.get(world).cur_projectionist_selected = false;
			BendymodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}

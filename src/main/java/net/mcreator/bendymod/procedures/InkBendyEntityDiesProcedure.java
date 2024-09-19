package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.network.BendymodModVariables;

public class InkBendyEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("cur_inkbendy") == true) {
			BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected = false;
			BendymodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}

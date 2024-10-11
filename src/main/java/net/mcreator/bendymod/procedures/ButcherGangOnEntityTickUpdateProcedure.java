package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.BendymodMod;

public class ButcherGangOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			if (IsTargetHidingProcedure.execute(entity) == true) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(0, y, 0, 1);
				if (entity instanceof Mob) {
					try {
						((Mob) entity).setTarget(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				BendymodMod.queueServerWork(40, () -> {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
				});
			}
		}
	}
}

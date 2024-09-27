package net.mcreator.bendymod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class SammyLawrenceOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (IsTargetHidingProcedure.execute(entity) == true) {
			if (entity instanceof Mob) {
				try {
					((Mob) entity).setTarget(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

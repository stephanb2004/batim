package net.mcreator.bendymod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.entity.LMSSitEntityEntity;

public class SitEntityOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Entity cur_player = null;
		if (!entity.isVehicle()) {
			if (entity instanceof LMSSitEntityEntity) {
				if (!(cur_player == null)) {
					cur_player.getPersistentData().putBoolean("hiding_lms", false);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (cur_player == null) {
				if (entity instanceof LMSSitEntityEntity) {
					cur_player = entity.getFirstPassenger();
				}
			}
		}
	}
}

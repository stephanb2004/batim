package net.mcreator.bendymod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.entity.LMSSitEntityEntity;

public class IsTargetHidingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean result = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isPassenger() && ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getVehicle()) instanceof LMSSitEntityEntity
				|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getPersistentData().getBoolean("hiding") == true) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}

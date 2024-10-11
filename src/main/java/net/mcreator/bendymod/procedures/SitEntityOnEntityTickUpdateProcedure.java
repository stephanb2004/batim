package net.mcreator.bendymod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

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
					if ((entity.getFirstPassenger()) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 50, false, false));
				}
			}
		}
	}
}

package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.entity.InkBendyEntity;
import net.mcreator.bendymod.entity.BorisBuddyEntity;

public class BorisBuddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if (entity instanceof BorisBuddyEntity) {
				((BorisBuddyEntity) entity).setAnimation("animation.model.cower");
			}
		} else {
			if (entity instanceof BorisBuddyEntity) {
				((BorisBuddyEntity) entity).setAnimation("empty");
			}
		}
	}
}

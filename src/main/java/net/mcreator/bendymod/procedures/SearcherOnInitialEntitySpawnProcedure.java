package net.mcreator.bendymod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.entity.SearcherEntity;

public class SearcherOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SearcherEntity) {
			((SearcherEntity) entity).setAnimation("animation.model.rise");
		}
	}
}

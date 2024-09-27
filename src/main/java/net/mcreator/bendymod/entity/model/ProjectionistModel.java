package net.mcreator.bendymod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.entity.ProjectionistEntity;

public class ProjectionistModel extends GeoModel<ProjectionistEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionistEntity entity) {
		return new ResourceLocation("bendymod", "animations/projectionist.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionistEntity entity) {
		return new ResourceLocation("bendymod", "geo/projectionist.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionistEntity entity) {
		return new ResourceLocation("bendymod", "textures/entities/" + entity.getTexture() + ".png");
	}

}

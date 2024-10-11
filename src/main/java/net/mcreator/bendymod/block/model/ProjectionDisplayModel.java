package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ProjectionDisplayItem;

public class ProjectionDisplayModel extends GeoModel<ProjectionDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/projection_blank.png");
	}
}

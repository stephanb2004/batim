package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ProjectionBlankDisplayItem;

public class ProjectionBlankDisplayModel extends GeoModel<ProjectionBlankDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionBlankDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionBlankDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionBlankDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/projection_blank.png");
	}
}

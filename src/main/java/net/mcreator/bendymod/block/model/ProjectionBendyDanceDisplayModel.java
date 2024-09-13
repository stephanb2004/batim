package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ProjectionBendyDanceDisplayItem;

public class ProjectionBendyDanceDisplayModel extends AnimatedGeoModel<ProjectionBendyDanceDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionBendyDanceDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionBendyDanceDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionBendyDanceDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/projection_bendydance.png");
	}
}

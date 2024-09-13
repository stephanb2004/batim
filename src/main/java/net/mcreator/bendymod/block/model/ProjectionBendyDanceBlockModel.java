package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ProjectionBendyDanceTileEntity;

public class ProjectionBendyDanceBlockModel extends AnimatedGeoModel<ProjectionBendyDanceTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionBendyDanceTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/projection_bendydance.png");
	}
}

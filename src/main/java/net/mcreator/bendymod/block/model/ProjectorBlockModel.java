package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ProjectorTileEntity;

public class ProjectorBlockModel extends AnimatedGeoModel<ProjectorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/projector.png");
	}
}

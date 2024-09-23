package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ProjectionBlankTileEntity;

public class ProjectionBlankBlockModel extends GeoModel<ProjectionBlankTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionBlankTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionBlankTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionBlankTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/projection_blank.png");
	}
}

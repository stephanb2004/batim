package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ProjectorTileEntity;

public class ProjectorBlockModel extends GeoModel<ProjectorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/projector.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ProjectionTileEntity;

public class ProjectionBlockModel extends GeoModel<ProjectionTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
		return new ResourceLocation("bendymod", "animations/projection_normal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
		return new ResourceLocation("bendymod", "geo/projection_normal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "textures/block/projection_bendydance.png");
		return new ResourceLocation("bendymod", "textures/block/projection_blank.png");
	}
}

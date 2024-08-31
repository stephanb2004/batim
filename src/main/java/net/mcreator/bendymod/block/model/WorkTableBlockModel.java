package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WorkTableTileEntity;

public class WorkTableBlockModel extends AnimatedGeoModel<WorkTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WorkTableTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/worktable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WorkTableTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/worktable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WorkTableTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/worktable.png");
	}
}

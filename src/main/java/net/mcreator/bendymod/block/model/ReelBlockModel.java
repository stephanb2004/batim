package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ReelTileEntity;

public class ReelBlockModel extends AnimatedGeoModel<ReelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReelTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/reel.png");
	}
}

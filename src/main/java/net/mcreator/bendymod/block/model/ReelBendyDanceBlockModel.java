package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ReelBendyDanceTileEntity;

public class ReelBendyDanceBlockModel extends AnimatedGeoModel<ReelBendyDanceTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReelBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelBendyDanceTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/reel.png");
	}
}

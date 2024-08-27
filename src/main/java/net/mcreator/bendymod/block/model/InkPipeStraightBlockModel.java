package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkPipeStraightTileEntity;

public class InkPipeStraightBlockModel extends AnimatedGeoModel<InkPipeStraightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeStraightTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_straight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeStraightTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_straight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeStraightTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_straight.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkPipeVerticalTileEntity;

public class InkPipeVerticalBlockModel extends AnimatedGeoModel<InkPipeVerticalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeVerticalTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_vertical.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeVerticalTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_vertical.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeVerticalTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_wall.png");
	}
}

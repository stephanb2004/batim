package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HangingMicTileEntity;

public class HangingMicBlockModel extends AnimatedGeoModel<HangingMicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HangingMicTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/hangingmic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingMicTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/hangingmic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingMicTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/hangingmic.png");
	}
}

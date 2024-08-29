package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.SoupCandleTileEntity;

public class SoupCandleBlockModel extends AnimatedGeoModel<SoupCandleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SoupCandleTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/baconsoup_candle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SoupCandleTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/baconsoup_candle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SoupCandleTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/baconsoup_candle.png");
	}
}

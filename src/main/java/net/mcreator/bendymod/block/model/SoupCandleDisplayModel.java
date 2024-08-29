package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.SoupCandleDisplayItem;

public class SoupCandleDisplayModel extends AnimatedGeoModel<SoupCandleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SoupCandleDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/baconsoup_candle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SoupCandleDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/baconsoup_candle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SoupCandleDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/baconsoup_candle.png");
	}
}

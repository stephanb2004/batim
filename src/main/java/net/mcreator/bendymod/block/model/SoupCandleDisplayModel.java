package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.SoupCandleDisplayItem;

public class SoupCandleDisplayModel extends GeoModel<SoupCandleDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/baconsoup_candle.png");
	}
}

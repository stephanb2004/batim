package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.FanDisplayItem;

public class FanDisplayModel extends GeoModel<FanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FanDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FanDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FanDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/fan.png");
	}
}

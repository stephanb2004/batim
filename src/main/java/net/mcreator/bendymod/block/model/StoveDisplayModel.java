package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StoveDisplayItem;

public class StoveDisplayModel extends GeoModel<StoveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StoveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/stove.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/stove.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoveDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/stove.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.HangingMicDisplayItem;

public class HangingMicDisplayModel extends GeoModel<HangingMicDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HangingMicDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/hangingmic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingMicDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/hangingmic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingMicDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/hangingmic.png");
	}
}

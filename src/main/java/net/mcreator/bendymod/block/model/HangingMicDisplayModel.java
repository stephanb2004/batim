package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.HangingMicDisplayItem;

public class HangingMicDisplayModel extends AnimatedGeoModel<HangingMicDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/blocks/hangingmic.png");
	}
}

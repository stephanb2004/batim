package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RadioDisplayItem;

public class RadioDisplayModel extends AnimatedGeoModel<RadioDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RadioDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/radio.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadioDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/radio.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadioDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/radio.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.SpeakerDisplayItem;

public class SpeakerDisplayModel extends AnimatedGeoModel<SpeakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpeakerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeakerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeakerDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/speaker.png");
	}
}

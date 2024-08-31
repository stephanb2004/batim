package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordingSignOnDisplayItem;

public class RecordingSignOnDisplayModel extends AnimatedGeoModel<RecordingSignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/recording_sign_a.png");
	}
}

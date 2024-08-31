package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordingSignOffDisplayItem;

public class RecordingSignOffDisplayModel extends AnimatedGeoModel<RecordingSignOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignOffDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/recording_sign.png");
	}
}

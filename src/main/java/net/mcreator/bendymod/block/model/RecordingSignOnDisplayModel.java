package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordingSignOnDisplayItem;

public class RecordingSignOnDisplayModel extends GeoModel<RecordingSignOnDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/recording_sign_on.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordingSignDisplayItem;

public class RecordingSignDisplayModel extends GeoModel<RecordingSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/recording_sign.png");
	}
}

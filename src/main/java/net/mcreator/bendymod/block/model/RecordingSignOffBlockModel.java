package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordingSignOffTileEntity;

public class RecordingSignOffBlockModel extends AnimatedGeoModel<RecordingSignOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignOffTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/recording_sign.png");
	}
}

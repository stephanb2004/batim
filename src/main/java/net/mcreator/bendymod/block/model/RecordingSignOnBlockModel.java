package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordingSignOnTileEntity;

public class RecordingSignOnBlockModel extends AnimatedGeoModel<RecordingSignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignOnTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/recording_sign_a.png");
	}
}

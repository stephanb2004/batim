package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordingSignOnTileEntity;

public class RecordingSignOnBlockModel extends GeoModel<RecordingSignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/recording_sign_on.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordingSignTileEntity;

public class RecordingSignBlockModel extends GeoModel<RecordingSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordingSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
		return new ResourceLocation("bendymod", "animations/recordingsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordingSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
		return new ResourceLocation("bendymod", "geo/recordingsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordingSignTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "textures/block/recording_sign_on.png");
		return new ResourceLocation("bendymod", "textures/block/recording_sign.png");
	}
}

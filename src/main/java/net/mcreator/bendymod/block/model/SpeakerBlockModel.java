package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.SpeakerTileEntity;

public class SpeakerBlockModel extends AnimatedGeoModel<SpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeakerTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/speaker.png");
	}
}

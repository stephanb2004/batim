package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.SpeakerTileEntity;

public class SpeakerBlockModel extends GeoModel<SpeakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeakerTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/speaker.png");
	}
}

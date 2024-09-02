package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PianoTileEntity;

public class PianoBlockModel extends AnimatedGeoModel<PianoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PianoTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/piano.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PianoTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/piano.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PianoTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/piano.png");
	}
}

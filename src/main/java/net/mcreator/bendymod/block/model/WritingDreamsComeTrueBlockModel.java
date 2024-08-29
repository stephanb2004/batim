package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingDreamsComeTrueTileEntity;

public class WritingDreamsComeTrueBlockModel extends AnimatedGeoModel<WritingDreamsComeTrueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingDreamsComeTrueTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDreamsComeTrueTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDreamsComeTrueTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_dreamscometrue.png");
	}
}

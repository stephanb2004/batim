package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingTheCreatorLiedToUsTileEntity;

public class WritingTheCreatorLiedToUsBlockModel extends AnimatedGeoModel<WritingTheCreatorLiedToUsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingTheCreatorLiedToUsTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingTheCreatorLiedToUsTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingTheCreatorLiedToUsTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_thecreatorliedtous.png");
	}
}

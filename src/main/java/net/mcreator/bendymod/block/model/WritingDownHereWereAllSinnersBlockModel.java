package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingDownHereWereAllSinnersTileEntity;

public class WritingDownHereWereAllSinnersBlockModel extends AnimatedGeoModel<WritingDownHereWereAllSinnersTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingDownHereWereAllSinnersTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDownHereWereAllSinnersTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDownHereWereAllSinnersTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_downherewereallsinners.png");
	}
}

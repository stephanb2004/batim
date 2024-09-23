package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingDownHereWereAllSinnersTileEntity;

public class WritingDownHereWereAllSinnersBlockModel extends GeoModel<WritingDownHereWereAllSinnersTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingDownHereWereAllSinnersTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDownHereWereAllSinnersTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDownHereWereAllSinnersTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_downherewereallsinners.png");
	}
}

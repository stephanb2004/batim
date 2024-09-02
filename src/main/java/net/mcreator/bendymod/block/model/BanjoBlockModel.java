package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BanjoTileEntity;

public class BanjoBlockModel extends AnimatedGeoModel<BanjoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BanjoTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/banjo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BanjoTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/banjo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BanjoTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/banjo.png");
	}
}

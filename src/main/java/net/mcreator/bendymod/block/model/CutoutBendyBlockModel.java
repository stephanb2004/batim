package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;

public class CutoutBendyBlockModel extends AnimatedGeoModel<CutoutBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cutout_bendy.png");
	}
}

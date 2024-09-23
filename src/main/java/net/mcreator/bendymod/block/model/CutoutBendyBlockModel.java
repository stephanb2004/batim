package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;

public class CutoutBendyBlockModel extends GeoModel<CutoutBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cutout_bendy.png");
	}
}

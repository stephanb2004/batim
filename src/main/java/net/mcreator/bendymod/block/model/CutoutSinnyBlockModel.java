package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;

public class CutoutSinnyBlockModel extends GeoModel<CutoutSinnyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cutout_sinny.png");
	}
}

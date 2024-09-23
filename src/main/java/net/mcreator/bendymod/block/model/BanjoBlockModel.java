package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BanjoTileEntity;

public class BanjoBlockModel extends GeoModel<BanjoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BanjoTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/banjo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BanjoTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/banjo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BanjoTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/banjo.png");
	}
}

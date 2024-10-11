package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.FanTileEntity;

public class FanBlockModel extends GeoModel<FanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FanTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FanTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FanTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/fan.png");
	}
}

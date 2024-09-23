package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioChairTileEntity;

public class StudioChairBlockModel extends GeoModel<StudioChairTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioChairTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/chair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioChairTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/chair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioChairTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/chair.png");
	}
}

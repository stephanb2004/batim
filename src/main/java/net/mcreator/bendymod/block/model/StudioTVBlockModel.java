package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioTVTileEntity;

public class StudioTVBlockModel extends GeoModel<StudioTVTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioTVTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/tv.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioTVTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/tv.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioTVTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/tv.png");
	}
}

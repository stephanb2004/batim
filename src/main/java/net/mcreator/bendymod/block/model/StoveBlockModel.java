package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StoveTileEntity;

public class StoveBlockModel extends GeoModel<StoveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StoveTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/stove.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StoveTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/stove.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StoveTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/stove.png");
	}
}

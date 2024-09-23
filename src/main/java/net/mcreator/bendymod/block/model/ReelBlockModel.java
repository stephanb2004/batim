package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ReelTileEntity;

public class ReelBlockModel extends GeoModel<ReelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReelTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/reel.png");
	}
}

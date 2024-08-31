package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HatRackTileEntity;

public class HatRackBlockModel extends AnimatedGeoModel<HatRackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HatRackTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/hatrack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HatRackTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/hatrack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HatRackTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/hatrack.png");
	}
}

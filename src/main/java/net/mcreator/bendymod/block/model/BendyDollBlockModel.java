package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyDollTileEntity;

public class BendyDollBlockModel extends AnimatedGeoModel<BendyDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendydoll.png");
	}
}

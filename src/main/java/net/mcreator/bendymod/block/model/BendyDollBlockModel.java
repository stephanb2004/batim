package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyDollTileEntity;

public class BendyDollBlockModel extends GeoModel<BendyDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bendydoll.png");
	}
}

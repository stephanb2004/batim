package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyClockTileEntity;

public class BendyClockBlockModel extends GeoModel<BendyClockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyClockTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendyclock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyClockTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendyclock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyClockTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bendyclock.png");
	}
}

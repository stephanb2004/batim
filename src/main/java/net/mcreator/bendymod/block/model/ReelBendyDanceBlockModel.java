package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ReelBendyDanceTileEntity;

public class ReelBendyDanceBlockModel extends GeoModel<ReelBendyDanceTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReelBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelBendyDanceTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/reel.png");
	}
}

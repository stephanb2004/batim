package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LargeBoxTileEntity;

public class LargeBoxBlockModel extends AnimatedGeoModel<LargeBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeBoxTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/large_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeBoxTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/large_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeBoxTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/large_box.png");
	}
}

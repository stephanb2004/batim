package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LargeBoxTileEntity;

public class LargeBoxBlockModel extends GeoModel<LargeBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeBoxTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/large_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeBoxTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/large_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeBoxTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/large_box.png");
	}
}

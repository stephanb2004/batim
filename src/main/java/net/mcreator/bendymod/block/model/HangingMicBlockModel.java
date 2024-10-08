package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HangingMicTileEntity;

public class HangingMicBlockModel extends GeoModel<HangingMicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HangingMicTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/hangingmic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingMicTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/hangingmic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingMicTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/hangingmic.png");
	}
}

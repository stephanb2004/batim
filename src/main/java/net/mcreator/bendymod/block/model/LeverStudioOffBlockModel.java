package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverStudioOffTileEntity;

public class LeverStudioOffBlockModel extends GeoModel<LeverStudioOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/switch_normal.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverStudioOffTileEntity;

public class LeverStudioOffBlockModel extends AnimatedGeoModel<LeverStudioOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioOffTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_normal.png");
	}
}

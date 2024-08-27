package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverPowerTileEntity;

public class LeverPowerBlockModel extends AnimatedGeoModel<LeverPowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

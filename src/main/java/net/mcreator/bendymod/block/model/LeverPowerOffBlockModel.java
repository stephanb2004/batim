package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverPowerOffTileEntity;

public class LeverPowerOffBlockModel extends AnimatedGeoModel<LeverPowerOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOffTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

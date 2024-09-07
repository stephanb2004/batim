package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverPowerOnTileEntity;

public class LeverPowerOnBlockModel extends AnimatedGeoModel<LeverPowerOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOnTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

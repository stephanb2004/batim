package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverPowerOffTileEntity;

public class LeverPowerOffBlockModel extends GeoModel<LeverPowerOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/switch_power.png");
	}
}

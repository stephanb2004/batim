package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverPowerOnTileEntity;

public class LeverPowerOnBlockModel extends GeoModel<LeverPowerOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/switch_power.png");
	}
}

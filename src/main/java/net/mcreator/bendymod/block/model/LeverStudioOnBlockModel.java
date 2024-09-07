package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverStudioOnTileEntity;

public class LeverStudioOnBlockModel extends AnimatedGeoModel<LeverStudioOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioOnTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_normal.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LeverStudioTileEntity;

public class LeverStudioBlockModel extends AnimatedGeoModel<LeverStudioTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/switch_lever.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/switch_lever.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

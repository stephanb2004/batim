package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ValveTileEntity;

public class ValveBlockModel extends AnimatedGeoModel<ValveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ValveTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/valve.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ValveTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/valve.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ValveTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/valve.png");
	}
}

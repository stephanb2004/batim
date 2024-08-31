package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.GearboxTileEntity;

public class GearboxBlockModel extends AnimatedGeoModel<GearboxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GearboxTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/gearbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GearboxTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/gearbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GearboxTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/gearbox.png");
	}
}

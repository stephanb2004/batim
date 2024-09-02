package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalTileEntity;

public class PedestalBlockModel extends AnimatedGeoModel<PedestalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal.png");
	}
}

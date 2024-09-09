package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalOnTileEntity;

public class PedestalOnBlockModel extends AnimatedGeoModel<PedestalOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalOnTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalRLOnTileEntity;

public class PedestalRLOnBlockModel extends AnimatedGeoModel<PedestalRLOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLOnTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal0_batdr.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalRLTileEntity;

public class PedestalRLBlockModel extends AnimatedGeoModel<PedestalRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal0_batdr.png");
	}
}

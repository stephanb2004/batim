package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalRLOnTileEntity;

public class PedestalRLOnBlockModel extends GeoModel<PedestalRLOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/pedestal0_batdr.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalTileEntity;

public class PedestalBlockModel extends GeoModel<PedestalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/pedestal.png");
	}
}

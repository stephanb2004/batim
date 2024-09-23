package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalOnTileEntity;

public class PedestalOnBlockModel extends GeoModel<PedestalOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/pedestal.png");
	}
}

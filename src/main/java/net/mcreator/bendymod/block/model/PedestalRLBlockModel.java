package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PedestalRLTileEntity;

public class PedestalRLBlockModel extends GeoModel<PedestalRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/pedestal0_batdr.png");
	}
}

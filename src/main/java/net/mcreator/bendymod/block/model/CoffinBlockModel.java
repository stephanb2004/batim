package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CoffinTileEntity;

public class CoffinBlockModel extends GeoModel<CoffinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffinTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/coffin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffinTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/coffin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffinTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/coffin.png");
	}
}

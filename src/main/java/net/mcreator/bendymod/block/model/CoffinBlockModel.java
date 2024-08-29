package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CoffinTileEntity;

public class CoffinBlockModel extends AnimatedGeoModel<CoffinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CoffinTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/coffin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffinTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/coffin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffinTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/coffin.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WrenchTileEntity;

public class WrenchBlockModel extends AnimatedGeoModel<WrenchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WrenchTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wrench.png");
	}
}

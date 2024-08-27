package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DresserTileEntity;

public class DresserBlockModel extends AnimatedGeoModel<DresserTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DresserTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/dresser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DresserTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/dresser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DresserTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/dresser.png");
	}
}

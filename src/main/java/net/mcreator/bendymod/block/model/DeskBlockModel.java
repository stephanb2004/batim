package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskTileEntity;

public class DeskBlockModel extends AnimatedGeoModel<DeskTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/desk.png");
	}
}

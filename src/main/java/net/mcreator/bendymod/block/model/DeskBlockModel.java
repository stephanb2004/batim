package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskTileEntity;

public class DeskBlockModel extends GeoModel<DeskTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/desk.png");
	}
}

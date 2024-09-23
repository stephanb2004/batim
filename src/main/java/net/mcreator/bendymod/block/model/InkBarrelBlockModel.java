package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkBarrelTileEntity;

public class InkBarrelBlockModel extends GeoModel<InkBarrelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkBarrelTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/ink_barrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkBarrelTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/ink_barrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkBarrelTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/ink_barrel.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ShelfTileEntity;

public class ShelfBlockModel extends GeoModel<ShelfTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShelfTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/shelf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShelfTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/shelf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShelfTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/shelf.png");
	}
}

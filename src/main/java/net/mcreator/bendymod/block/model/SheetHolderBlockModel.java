package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.SheetHolderTileEntity;

public class SheetHolderBlockModel extends AnimatedGeoModel<SheetHolderTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SheetHolderTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/sheetholder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SheetHolderTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/sheetholder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SheetHolderTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/sheetholder.png");
	}
}

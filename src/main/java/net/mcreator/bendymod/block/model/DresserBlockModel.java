package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DresserTileEntity;

public class DresserBlockModel extends GeoModel<DresserTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DresserTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/dresser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DresserTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/dresser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DresserTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/dresser.png");
	}
}

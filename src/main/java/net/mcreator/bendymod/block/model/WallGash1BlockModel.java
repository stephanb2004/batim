package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WallGash1TileEntity;

public class WallGash1BlockModel extends AnimatedGeoModel<WallGash1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallGash1TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_gash1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallGash1TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_gash1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallGash1TileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wall_gash1.png");
	}
}

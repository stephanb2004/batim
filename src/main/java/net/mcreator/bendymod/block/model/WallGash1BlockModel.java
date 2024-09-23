package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WallGash1TileEntity;

public class WallGash1BlockModel extends GeoModel<WallGash1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallGash1TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_gash1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallGash1TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_gash1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallGash1TileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wall_gash1.png");
	}
}

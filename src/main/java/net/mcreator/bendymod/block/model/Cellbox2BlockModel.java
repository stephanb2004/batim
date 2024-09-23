package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.Cellbox2TileEntity;

public class Cellbox2BlockModel extends GeoModel<Cellbox2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox2TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox2TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox2TileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cellbox.png");
	}
}

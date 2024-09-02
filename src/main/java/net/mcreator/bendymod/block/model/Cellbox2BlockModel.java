package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.Cellbox2TileEntity;

public class Cellbox2BlockModel extends AnimatedGeoModel<Cellbox2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox2TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox2TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox2TileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cellbox.png");
	}
}

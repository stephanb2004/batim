package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.Cellbox0TileEntity;

public class Cellbox0BlockModel extends AnimatedGeoModel<Cellbox0TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox0TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox0TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox0TileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cellbox_0.png");
	}
}

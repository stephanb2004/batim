package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.Cellbox0TileEntity;

public class Cellbox0BlockModel extends GeoModel<Cellbox0TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox0TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox0TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox0TileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cellbox_0.png");
	}
}

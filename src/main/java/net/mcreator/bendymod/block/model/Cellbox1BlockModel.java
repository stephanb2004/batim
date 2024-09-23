package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.Cellbox1TileEntity;

public class Cellbox1BlockModel extends GeoModel<Cellbox1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox1TileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox1TileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox1TileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cellbox_1.png");
	}
}

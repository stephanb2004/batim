package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BorisDollTileEntity;

public class BorisDollBlockModel extends GeoModel<BorisDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boris_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boris_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/boris_plush.png");
	}
}

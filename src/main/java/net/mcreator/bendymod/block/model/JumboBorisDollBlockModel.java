package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.JumboBorisDollTileEntity;

public class JumboBorisDollBlockModel extends GeoModel<JumboBorisDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JumboBorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boris_plush_big.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumboBorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boris_plush_big.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumboBorisDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/boris_plush_big.png");
	}
}

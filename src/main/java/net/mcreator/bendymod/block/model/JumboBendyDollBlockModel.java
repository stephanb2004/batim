package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.JumboBendyDollTileEntity;

public class JumboBendyDollBlockModel extends GeoModel<JumboBendyDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JumboBendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_plush_big.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumboBendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_plush_big.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumboBendyDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bendy_plush_big.png");
	}
}

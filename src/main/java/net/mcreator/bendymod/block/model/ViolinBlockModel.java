package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ViolinTileEntity;

public class ViolinBlockModel extends AnimatedGeoModel<ViolinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ViolinTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/violin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ViolinTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/violin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ViolinTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/violin.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyStatueTileEntity;

public class BendyStatueBlockModel extends AnimatedGeoModel<BendyStatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyStatueTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_statue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyStatueTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_statue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyStatueTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendy_statue.png");
	}
}

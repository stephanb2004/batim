package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingSingWithMeTileEntity;

public class WritingSingWithMeBlockModel extends AnimatedGeoModel<WritingSingWithMeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingSingWithMeTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingSingWithMeTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingSingWithMeTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_singwithme.png");
	}
}

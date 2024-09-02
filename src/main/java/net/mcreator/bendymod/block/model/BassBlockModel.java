package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BassTileEntity;

public class BassBlockModel extends AnimatedGeoModel<BassTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BassTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bass.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BassTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bass.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BassTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bass.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BorisCloneTileEntity;

public class BorisCloneBlockModel extends AnimatedGeoModel<BorisCloneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BorisCloneTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boris_clone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisCloneTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boris_clone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisCloneTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/boris_clone.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyBookStackTileEntity;

public class BendyBookStackBlockModel extends AnimatedGeoModel<BendyBookStackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyBookStackTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/book_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyBookStackTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/book_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyBookStackTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/book_bendy.png");
	}
}

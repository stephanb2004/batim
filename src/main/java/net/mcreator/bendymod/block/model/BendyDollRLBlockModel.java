package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyDollRLTileEntity;

public class BendyDollRLBlockModel extends AnimatedGeoModel<BendyDollRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollRLTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendydoll_batdr.png");
	}
}

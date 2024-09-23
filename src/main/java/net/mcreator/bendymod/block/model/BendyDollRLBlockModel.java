package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyDollRLTileEntity;

public class BendyDollRLBlockModel extends GeoModel<BendyDollRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bendydoll_batdr.png");
	}
}

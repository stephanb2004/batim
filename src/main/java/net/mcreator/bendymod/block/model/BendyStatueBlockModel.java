package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BendyStatueTileEntity;

public class BendyStatueBlockModel extends GeoModel<BendyStatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BendyStatueTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_statue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyStatueTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_statue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyStatueTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bendy_statue.png");
	}
}

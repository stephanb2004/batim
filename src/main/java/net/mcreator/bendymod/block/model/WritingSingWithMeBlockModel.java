package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingSingWithMeTileEntity;

public class WritingSingWithMeBlockModel extends GeoModel<WritingSingWithMeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingSingWithMeTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingSingWithMeTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingSingWithMeTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_singwithme.png");
	}
}

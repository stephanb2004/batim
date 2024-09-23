package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingDreamsComeTrueTileEntity;

public class WritingDreamsComeTrueBlockModel extends GeoModel<WritingDreamsComeTrueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingDreamsComeTrueTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDreamsComeTrueTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDreamsComeTrueTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_dreamscometrue.png");
	}
}

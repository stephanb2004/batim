package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingTheCreatorLiedToUsTileEntity;

public class WritingTheCreatorLiedToUsBlockModel extends GeoModel<WritingTheCreatorLiedToUsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingTheCreatorLiedToUsTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingTheCreatorLiedToUsTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingTheCreatorLiedToUsTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_thecreatorliedtous.png");
	}
}

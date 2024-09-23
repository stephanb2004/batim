package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingItsTimeToBelieveTileEntity;

public class WritingItsTimeToBelieveBlockModel extends GeoModel<WritingItsTimeToBelieveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingItsTimeToBelieveTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingItsTimeToBelieveTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingItsTimeToBelieveTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_itstimetobelieve.png");
	}
}

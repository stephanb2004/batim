package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BassTileEntity;

public class BassBlockModel extends GeoModel<BassTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BassTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bass.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BassTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bass.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BassTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/bass.png");
	}
}

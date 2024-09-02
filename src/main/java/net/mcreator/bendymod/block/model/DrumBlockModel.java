package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DrumTileEntity;

public class DrumBlockModel extends AnimatedGeoModel<DrumTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrumTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/drum.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrumTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/drum.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrumTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/drum.png");
	}
}

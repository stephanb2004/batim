package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InfermaryBedTileEntity;

public class InfermaryBedBlockModel extends AnimatedGeoModel<InfermaryBedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfermaryBedTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/infermary_bed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfermaryBedTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/infermary_bed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfermaryBedTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/infermary_bed.png");
	}
}

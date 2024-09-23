package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InfermaryBedTileEntity;

public class InfermaryBedBlockModel extends GeoModel<InfermaryBedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfermaryBedTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/infermary_bed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfermaryBedTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/infermary_bed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfermaryBedTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/infermary_bed.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DrumTileEntity;

public class DrumBlockModel extends GeoModel<DrumTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrumTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/drum.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrumTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/drum.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrumTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/drum.png");
	}
}

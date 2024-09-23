package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.LittleMiracleStationTileEntity;

public class LittleMiracleStationBlockModel extends GeoModel<LittleMiracleStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LittleMiracleStationTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/lms.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LittleMiracleStationTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/lms.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LittleMiracleStationTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/lms.png");
	}
}

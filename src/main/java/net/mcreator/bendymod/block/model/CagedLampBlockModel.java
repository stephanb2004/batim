package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CagedLampTileEntity;

public class CagedLampBlockModel extends GeoModel<CagedLampTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CagedLampTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/caged_lamp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CagedLampTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/caged_lamp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CagedLampTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/caged_lamp.png");
	}
}

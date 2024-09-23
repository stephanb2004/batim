package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LittleMiracleStationDisplayItem;

public class LittleMiracleStationDisplayModel extends GeoModel<LittleMiracleStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LittleMiracleStationDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/lms.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LittleMiracleStationDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/lms.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LittleMiracleStationDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/lms.png");
	}
}

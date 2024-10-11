package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CagedLampDisplayItem;

public class CagedLampDisplayModel extends GeoModel<CagedLampDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CagedLampDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/caged_lamp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CagedLampDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/caged_lamp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CagedLampDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/caged_lamp.png");
	}
}

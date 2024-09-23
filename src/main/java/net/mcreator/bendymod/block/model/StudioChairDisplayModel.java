package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioChairDisplayItem;

public class StudioChairDisplayModel extends GeoModel<StudioChairDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioChairDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/chair.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioChairDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/chair.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioChairDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/chair.png");
	}
}

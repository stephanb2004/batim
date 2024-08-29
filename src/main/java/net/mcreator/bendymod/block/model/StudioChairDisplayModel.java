package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioChairDisplayItem;

public class StudioChairDisplayModel extends AnimatedGeoModel<StudioChairDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/blocks/chair.png");
	}
}

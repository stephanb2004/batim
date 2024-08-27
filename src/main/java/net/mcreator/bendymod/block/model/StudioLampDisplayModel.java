package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioLampDisplayItem;

public class StudioLampDisplayModel extends AnimatedGeoModel<StudioLampDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioLampDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/studio_lamp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioLampDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/studio_lamp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioLampDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/studio_lamp.png");
	}
}

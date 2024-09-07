package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverStudioOnDisplayItem;

public class LeverStudioOnDisplayModel extends AnimatedGeoModel<LeverStudioOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_normal.png");
	}
}

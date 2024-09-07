package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverPowerOnDisplayItem;

public class LeverPowerOnDisplayModel extends AnimatedGeoModel<LeverPowerOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_on.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_on.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

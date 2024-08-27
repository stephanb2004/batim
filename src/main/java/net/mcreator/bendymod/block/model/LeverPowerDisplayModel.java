package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverPowerDisplayItem;

public class LeverPowerDisplayModel extends AnimatedGeoModel<LeverPowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

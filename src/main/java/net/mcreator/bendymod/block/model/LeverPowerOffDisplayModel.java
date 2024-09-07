package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverPowerOffDisplayItem;

public class LeverPowerOffDisplayModel extends AnimatedGeoModel<LeverPowerOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverPowerOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverPowerOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverPowerOffDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

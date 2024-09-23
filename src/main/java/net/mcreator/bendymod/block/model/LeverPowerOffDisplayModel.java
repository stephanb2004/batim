package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverPowerOffDisplayItem;

public class LeverPowerOffDisplayModel extends GeoModel<LeverPowerOffDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/switch_power.png");
	}
}

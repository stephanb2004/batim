package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverStudioOffDisplayItem;

public class LeverStudioOffDisplayModel extends GeoModel<LeverStudioOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_power_off.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_power_off.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioOffDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/switch_normal.png");
	}
}

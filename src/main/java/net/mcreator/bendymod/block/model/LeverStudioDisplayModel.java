package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LeverStudioDisplayItem;

public class LeverStudioDisplayModel extends AnimatedGeoModel<LeverStudioDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeverStudioDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/switch_lever.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeverStudioDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/switch_lever.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeverStudioDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/switch_power.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalDisplayItem;

public class PedestalDisplayModel extends AnimatedGeoModel<PedestalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PedestalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal.png");
	}
}

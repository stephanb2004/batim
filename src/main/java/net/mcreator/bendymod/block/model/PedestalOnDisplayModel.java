package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalOnDisplayItem;

public class PedestalOnDisplayModel extends AnimatedGeoModel<PedestalOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PedestalOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal.png");
	}
}

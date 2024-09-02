package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WrenchDisplayItem;

public class WrenchDisplayModel extends AnimatedGeoModel<WrenchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WrenchDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wrench.png");
	}
}

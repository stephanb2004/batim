package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ViolinDisplayItem;

public class ViolinDisplayModel extends AnimatedGeoModel<ViolinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ViolinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/violin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ViolinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/violin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ViolinDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/violin.png");
	}
}

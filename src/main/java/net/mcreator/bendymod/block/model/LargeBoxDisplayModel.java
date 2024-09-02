package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.LargeBoxDisplayItem;

public class LargeBoxDisplayModel extends AnimatedGeoModel<LargeBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeBoxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/large_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeBoxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/large_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeBoxDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/large_box.png");
	}
}

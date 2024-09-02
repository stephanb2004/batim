package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BanjoDisplayItem;

public class BanjoDisplayModel extends AnimatedGeoModel<BanjoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BanjoDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/banjo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BanjoDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/banjo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BanjoDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/banjo.png");
	}
}

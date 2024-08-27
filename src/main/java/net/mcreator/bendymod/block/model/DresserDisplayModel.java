package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DresserDisplayItem;

public class DresserDisplayModel extends AnimatedGeoModel<DresserDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DresserDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/dresser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DresserDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/dresser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DresserDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/dresser.png");
	}
}

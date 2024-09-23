package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ReelDisplayItem;

public class ReelDisplayModel extends GeoModel<ReelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ReelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/reel.png");
	}
}

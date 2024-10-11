package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioTVDisplayItem;

public class StudioTVDisplayModel extends GeoModel<StudioTVDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioTVDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/tv.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioTVDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/tv.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioTVDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/tv.png");
	}
}

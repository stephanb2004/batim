package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioToiletDisplayItem;

public class StudioToiletDisplayModel extends GeoModel<StudioToiletDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioToiletDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/inktoilet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioToiletDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/inktoilet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioToiletDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/studio_toilet.png");
	}
}

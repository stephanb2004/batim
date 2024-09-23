package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DrumDisplayItem;

public class DrumDisplayModel extends GeoModel<DrumDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrumDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/drum.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrumDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/drum.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrumDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/drum.png");
	}
}

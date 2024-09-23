package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BassDisplayItem;

public class BassDisplayModel extends GeoModel<BassDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BassDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bass.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BassDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bass.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BassDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/bass.png");
	}
}

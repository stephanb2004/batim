package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BorisDollDisplayItem;

public class BorisDollDisplayModel extends GeoModel<BorisDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BorisDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/boris_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/boris_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisDollDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/boris_plush.png");
	}
}

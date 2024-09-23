package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DeskDisplayItem;

public class DeskDisplayModel extends GeoModel<DeskDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeskDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/desk.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DresserDisplayItem;

public class DresserDisplayModel extends GeoModel<DresserDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/dresser.png");
	}
}

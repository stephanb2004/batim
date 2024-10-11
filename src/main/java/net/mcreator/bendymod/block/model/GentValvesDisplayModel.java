package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.GentValvesDisplayItem;

public class GentValvesDisplayModel extends GeoModel<GentValvesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GentValvesDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/gent_valves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GentValvesDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/gent_valves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GentValvesDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/gent_valves.png");
	}
}

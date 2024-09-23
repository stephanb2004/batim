package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ValveDisplayItem;

public class ValveDisplayModel extends GeoModel<ValveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ValveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/valve.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ValveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/valve.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ValveDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/valve.png");
	}
}

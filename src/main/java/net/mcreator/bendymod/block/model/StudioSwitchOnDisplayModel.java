package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioSwitchOnDisplayItem;

public class StudioSwitchOnDisplayModel extends GeoModel<StudioSwitchOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioSwitchOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/slide_lever_down.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioSwitchOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/slide_lever_down.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioSwitchOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/slide_lever.png");
	}
}

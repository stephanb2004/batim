package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.StudioSwitchOffDisplayItem;

public class StudioSwitchOffDisplayModel extends GeoModel<StudioSwitchOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StudioSwitchOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/slide_lever_up.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioSwitchOffDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/slide_lever_up.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioSwitchOffDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/slide_lever.png");
	}
}

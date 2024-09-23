package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalDisplayItem;

public class PedestalDisplayModel extends GeoModel<PedestalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PedestalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/pedestal.png");
	}
}

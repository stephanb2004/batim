package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.GearboxDisplayItem;

public class GearboxDisplayModel extends GeoModel<GearboxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GearboxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/gearbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GearboxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/gearbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GearboxDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/gearbox.png");
	}
}

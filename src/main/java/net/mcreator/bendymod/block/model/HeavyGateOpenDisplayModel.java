package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.HeavyGateOpenDisplayItem;

public class HeavyGateOpenDisplayModel extends GeoModel<HeavyGateOpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGateOpenDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/gate_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGateOpenDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/gate_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGateOpenDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/gate.png");
	}
}

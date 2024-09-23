package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.HeavyGateClosedDisplayItem;

public class HeavyGateClosedDisplayModel extends GeoModel<HeavyGateClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGateClosedDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/gate_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGateClosedDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/gate_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGateClosedDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/gate.png");
	}
}

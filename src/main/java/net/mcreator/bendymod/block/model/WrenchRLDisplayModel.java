package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WrenchRLDisplayItem;

public class WrenchRLDisplayModel extends GeoModel<WrenchRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WrenchRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/wrench_batdr.png");
	}
}

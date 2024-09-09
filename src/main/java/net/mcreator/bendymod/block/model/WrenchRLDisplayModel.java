package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WrenchRLDisplayItem;

public class WrenchRLDisplayModel extends AnimatedGeoModel<WrenchRLDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/blocks/wrench_batdr.png");
	}
}

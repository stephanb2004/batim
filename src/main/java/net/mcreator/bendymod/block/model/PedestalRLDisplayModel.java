package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalRLDisplayItem;

public class PedestalRLDisplayModel extends AnimatedGeoModel<PedestalRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal0_batdr.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalRLOnDisplayItem;

public class PedestalRLOnDisplayModel extends AnimatedGeoModel<PedestalRLOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PedestalRLOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pedestal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PedestalRLOnDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pedestal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PedestalRLOnDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pedestal0_batdr.png");
	}
}

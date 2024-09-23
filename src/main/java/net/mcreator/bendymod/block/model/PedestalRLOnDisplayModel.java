package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PedestalRLOnDisplayItem;

public class PedestalRLOnDisplayModel extends GeoModel<PedestalRLOnDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/pedestal0_batdr.png");
	}
}

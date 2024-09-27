package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.SofaDisplayItem;

public class SofaDisplayModel extends GeoModel<SofaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SofaDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/sofa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SofaDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/sofa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SofaDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/sofa.png");
	}
}

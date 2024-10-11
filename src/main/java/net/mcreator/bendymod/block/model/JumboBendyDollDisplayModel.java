package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.JumboBendyDollDisplayItem;

public class JumboBendyDollDisplayModel extends GeoModel<JumboBendyDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JumboBendyDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_plush_big.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumboBendyDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_plush_big.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumboBendyDollDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/bendy_plush_big.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.JumboBorisDollDisplayItem;

public class JumboBorisDollDisplayModel extends GeoModel<JumboBorisDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JumboBorisDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/boris_plush_big.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumboBorisDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/boris_plush_big.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumboBorisDollDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/boris_plush_big.png");
	}
}

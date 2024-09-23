package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BendyBookStackDisplayItem;

public class BendyBookStackDisplayModel extends GeoModel<BendyBookStackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BendyBookStackDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/book_stack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyBookStackDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/book_stack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyBookStackDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/book_bendy.png");
	}
}

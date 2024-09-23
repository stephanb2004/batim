package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingItsTimeToBelieveDisplayItem;

public class WritingItsTimeToBelieveDisplayModel extends GeoModel<WritingItsTimeToBelieveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingItsTimeToBelieveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingItsTimeToBelieveDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingItsTimeToBelieveDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_itstimetobelieve.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingItsTimeToBelieveDisplayItem;

public class WritingItsTimeToBelieveDisplayModel extends AnimatedGeoModel<WritingItsTimeToBelieveDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_itstimetobelieve.png");
	}
}

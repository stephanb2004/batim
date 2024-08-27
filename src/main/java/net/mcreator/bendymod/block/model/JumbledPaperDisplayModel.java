package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.JumbledPaperDisplayItem;

public class JumbledPaperDisplayModel extends AnimatedGeoModel<JumbledPaperDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JumbledPaperDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/paper_jumbled.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumbledPaperDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/paper_jumbled.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumbledPaperDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/paper.png");
	}
}

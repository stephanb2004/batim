package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.IllusionOfLivingDisplayItem;

public class IllusionOfLivingDisplayModel extends AnimatedGeoModel<IllusionOfLivingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IllusionOfLivingDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusionOfLivingDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusionOfLivingDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/illusionofliving.png");
	}
}

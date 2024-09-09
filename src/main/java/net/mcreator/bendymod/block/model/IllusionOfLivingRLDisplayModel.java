package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.IllusionOfLivingRLDisplayItem;

public class IllusionOfLivingRLDisplayModel extends AnimatedGeoModel<IllusionOfLivingRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IllusionOfLivingRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusionOfLivingRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusionOfLivingRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/illusionofliving_batdr.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.IllusionOfLivingTileEntity;

public class IllusionOfLivingBlockModel extends AnimatedGeoModel<IllusionOfLivingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IllusionOfLivingTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusionOfLivingTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusionOfLivingTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/illusionofliving.png");
	}
}

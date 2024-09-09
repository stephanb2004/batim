package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.IllusionOfLivingRLTileEntity;

public class IllusionOfLivingRLBlockModel extends AnimatedGeoModel<IllusionOfLivingRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IllusionOfLivingRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusionOfLivingRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusionOfLivingRLTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/illusionofliving_batdr.png");
	}
}

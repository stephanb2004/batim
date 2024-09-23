package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.IllusionOfLivingRLTileEntity;

public class IllusionOfLivingRLBlockModel extends GeoModel<IllusionOfLivingRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IllusionOfLivingRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IllusionOfLivingRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IllusionOfLivingRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/illusionofliving_batdr.png");
	}
}

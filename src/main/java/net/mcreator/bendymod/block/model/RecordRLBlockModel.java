package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordRLTileEntity;

public class RecordRLBlockModel extends AnimatedGeoModel<RecordRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordRLTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/record_batdr.png");
	}
}

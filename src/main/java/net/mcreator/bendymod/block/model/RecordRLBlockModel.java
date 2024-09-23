package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordRLTileEntity;

public class RecordRLBlockModel extends GeoModel<RecordRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/record_batdr.png");
	}
}

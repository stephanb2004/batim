package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RecordTileEntity;

public class RecordBlockModel extends GeoModel<RecordTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RecordTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/record.png");
	}
}

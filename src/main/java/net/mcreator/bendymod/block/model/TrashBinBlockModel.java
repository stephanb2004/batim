package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.TrashBinTileEntity;

public class TrashBinBlockModel extends AnimatedGeoModel<TrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/trashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/trashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/trash_bin.png");
	}
}

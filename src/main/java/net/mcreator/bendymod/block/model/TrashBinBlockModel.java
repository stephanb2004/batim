package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.TrashBinTileEntity;

public class TrashBinBlockModel extends GeoModel<TrashBinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/trashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/trashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/trash_bin.png");
	}
}

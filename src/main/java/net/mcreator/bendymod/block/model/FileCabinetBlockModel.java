package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.FileCabinetTileEntity;

public class FileCabinetBlockModel extends GeoModel<FileCabinetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FileCabinetTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/filecabinet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FileCabinetTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/filecabinet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FileCabinetTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/filebacinet.png");
	}
}

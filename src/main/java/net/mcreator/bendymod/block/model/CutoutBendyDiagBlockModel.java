package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutBendyDiagTileEntity;

public class CutoutBendyDiagBlockModel extends GeoModel<CutoutBendyDiagTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cutout_bendy.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutSinnyDiagTileEntity;

public class CutoutSinnyDiagBlockModel extends GeoModel<CutoutSinnyDiagTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cutout_sinny.png");
	}
}

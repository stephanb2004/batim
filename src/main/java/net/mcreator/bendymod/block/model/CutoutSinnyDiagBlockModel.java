package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutSinnyDiagTileEntity;

public class CutoutSinnyDiagBlockModel extends AnimatedGeoModel<CutoutSinnyDiagTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyDiagTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyDiagTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cutout_sinny.png");
	}
}

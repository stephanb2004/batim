package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;

public class CutoutBendyBlockModel extends GeoModel<CutoutBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("bendymod", "textures/block/cutout_bendy.png");
		return new ResourceLocation("bendymod", "textures/block/cutout_bendy.png");
	}
}

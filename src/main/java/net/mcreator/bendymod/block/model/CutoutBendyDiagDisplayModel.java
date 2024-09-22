package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutBendyDiagDisplayItem;

public class CutoutBendyDiagDisplayModel extends AnimatedGeoModel<CutoutBendyDiagDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyDiagDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyDiagDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyDiagDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cutout_bendy.png");
	}
}

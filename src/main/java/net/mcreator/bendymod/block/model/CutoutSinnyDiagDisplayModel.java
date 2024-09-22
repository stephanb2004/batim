package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutSinnyDiagDisplayItem;

public class CutoutSinnyDiagDisplayModel extends AnimatedGeoModel<CutoutSinnyDiagDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyDiagDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_cutout_diag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyDiagDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_cutout_diag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyDiagDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cutout_sinny.png");
	}
}

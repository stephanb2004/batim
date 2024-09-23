package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutSinnyDiagDisplayItem;

public class CutoutSinnyDiagDisplayModel extends GeoModel<CutoutSinnyDiagDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/cutout_sinny.png");
	}
}

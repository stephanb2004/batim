package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.IndustrialWallPanelDisplayItem;

public class IndustrialWallPanelDisplayModel extends GeoModel<IndustrialWallPanelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialWallPanelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/industrial_wall_panel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialWallPanelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/industrial_wall_panel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialWallPanelDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/industrial_wall_panel.png");
	}
}

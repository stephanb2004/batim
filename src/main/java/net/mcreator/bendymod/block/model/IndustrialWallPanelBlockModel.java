package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.IndustrialWallPanelTileEntity;

public class IndustrialWallPanelBlockModel extends GeoModel<IndustrialWallPanelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialWallPanelTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/industrial_wall_panel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialWallPanelTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/industrial_wall_panel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialWallPanelTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/industrial_wall_panel.png");
	}
}

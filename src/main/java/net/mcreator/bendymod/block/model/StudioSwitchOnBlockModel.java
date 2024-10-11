package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioSwitchOnTileEntity;

public class StudioSwitchOnBlockModel extends GeoModel<StudioSwitchOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioSwitchOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/slide_lever_down.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioSwitchOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/slide_lever_down.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioSwitchOnTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/slide_lever.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.GentValvesTileEntity;

public class GentValvesBlockModel extends GeoModel<GentValvesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GentValvesTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/gent_valves.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GentValvesTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/gent_valves.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GentValvesTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/gent_valves.png");
	}
}

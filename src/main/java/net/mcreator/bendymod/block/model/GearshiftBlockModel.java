package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.GearshiftTileEntity;

public class GearshiftBlockModel extends GeoModel<GearshiftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GearshiftTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cog_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GearshiftTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cog_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GearshiftTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cog_box.png");
	}
}

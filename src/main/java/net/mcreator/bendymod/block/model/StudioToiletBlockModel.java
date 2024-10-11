package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioToiletTileEntity;

public class StudioToiletBlockModel extends GeoModel<StudioToiletTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioToiletTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/inktoilet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioToiletTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/inktoilet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioToiletTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/studio_toilet.png");
	}
}

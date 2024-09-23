package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CassettePlayerTileEntity;

public class CassettePlayerBlockModel extends GeoModel<CassettePlayerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CassettePlayerTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/cassette_player.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CassettePlayerTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/cassette_player.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CassettePlayerTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/cassetteplayer.png");
	}
}

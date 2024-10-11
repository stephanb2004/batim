package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.AliceAngelDollTileEntity;

public class AliceAngelDollBlockModel extends GeoModel<AliceAngelDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AliceAngelDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/alice_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AliceAngelDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/alice_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AliceAngelDollTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/alice_plush.png");
	}
}

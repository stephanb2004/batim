package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingWhosLaughingNowTileEntity;

public class WritingWhosLaughingNowBlockModel extends GeoModel<WritingWhosLaughingNowTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingWhosLaughingNowTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingWhosLaughingNowTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingWhosLaughingNowTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_whoslaughingnow.png");
	}
}

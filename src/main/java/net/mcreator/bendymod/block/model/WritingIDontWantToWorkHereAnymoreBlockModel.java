package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingIDontWantToWorkHereAnymoreTileEntity;

public class WritingIDontWantToWorkHereAnymoreBlockModel extends GeoModel<WritingIDontWantToWorkHereAnymoreTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingIDontWantToWorkHereAnymoreTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingIDontWantToWorkHereAnymoreTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingIDontWantToWorkHereAnymoreTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_idontwanttoworkhereanymore.png");
	}
}

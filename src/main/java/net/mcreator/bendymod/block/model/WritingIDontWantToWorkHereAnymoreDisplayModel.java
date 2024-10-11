package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingIDontWantToWorkHereAnymoreDisplayItem;

public class WritingIDontWantToWorkHereAnymoreDisplayModel extends GeoModel<WritingIDontWantToWorkHereAnymoreDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingIDontWantToWorkHereAnymoreDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingIDontWantToWorkHereAnymoreDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingIDontWantToWorkHereAnymoreDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_idontwanttoworkhereanymore.png");
	}
}

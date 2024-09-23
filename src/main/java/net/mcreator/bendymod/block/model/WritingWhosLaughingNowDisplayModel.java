package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingWhosLaughingNowDisplayItem;

public class WritingWhosLaughingNowDisplayModel extends GeoModel<WritingWhosLaughingNowDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingWhosLaughingNowDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingWhosLaughingNowDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingWhosLaughingNowDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/wallwriting_whoslaughingnow.png");
	}
}

package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.JDSSignDisplayItem;

public class JDSSignDisplayModel extends GeoModel<JDSSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JDSSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/jds.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JDSSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/jds.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JDSSignDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/joeydrewstudios_sign.png");
	}
}

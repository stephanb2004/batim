package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ToolboxDisplayItem;

public class ToolboxDisplayModel extends GeoModel<ToolboxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToolboxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/toolbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolboxDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/toolbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolboxDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/toolbox.png");
	}
}

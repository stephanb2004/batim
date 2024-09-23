package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.TrashBinDisplayItem;

public class TrashBinDisplayModel extends GeoModel<TrashBinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashBinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/trashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashBinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/trashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashBinDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/trash_bin.png");
	}
}

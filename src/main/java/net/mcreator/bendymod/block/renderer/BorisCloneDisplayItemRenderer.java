package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BorisCloneDisplayModel;
import net.mcreator.bendymod.block.display.BorisCloneDisplayItem;

public class BorisCloneDisplayItemRenderer extends GeoItemRenderer<BorisCloneDisplayItem> {
	public BorisCloneDisplayItemRenderer() {
		super(new BorisCloneDisplayModel());
	}

	@Override
	public RenderType getRenderType(BorisCloneDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

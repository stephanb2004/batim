package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JumboBendyDollDisplayModel;
import net.mcreator.bendymod.block.display.JumboBendyDollDisplayItem;

public class JumboBendyDollDisplayItemRenderer extends GeoItemRenderer<JumboBendyDollDisplayItem> {
	public JumboBendyDollDisplayItemRenderer() {
		super(new JumboBendyDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(JumboBendyDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

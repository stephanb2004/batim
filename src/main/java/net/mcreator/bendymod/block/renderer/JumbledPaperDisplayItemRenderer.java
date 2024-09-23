package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JumbledPaperDisplayModel;
import net.mcreator.bendymod.block.display.JumbledPaperDisplayItem;

public class JumbledPaperDisplayItemRenderer extends GeoItemRenderer<JumbledPaperDisplayItem> {
	public JumbledPaperDisplayItemRenderer() {
		super(new JumbledPaperDisplayModel());
	}

	@Override
	public RenderType getRenderType(JumbledPaperDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

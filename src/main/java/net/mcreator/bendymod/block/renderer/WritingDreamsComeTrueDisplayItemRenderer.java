package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDreamsComeTrueDisplayModel;
import net.mcreator.bendymod.block.display.WritingDreamsComeTrueDisplayItem;

public class WritingDreamsComeTrueDisplayItemRenderer extends GeoItemRenderer<WritingDreamsComeTrueDisplayItem> {
	public WritingDreamsComeTrueDisplayItemRenderer() {
		super(new WritingDreamsComeTrueDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingDreamsComeTrueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

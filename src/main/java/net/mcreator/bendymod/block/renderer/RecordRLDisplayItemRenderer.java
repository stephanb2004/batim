package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordRLDisplayModel;
import net.mcreator.bendymod.block.display.RecordRLDisplayItem;

public class RecordRLDisplayItemRenderer extends GeoItemRenderer<RecordRLDisplayItem> {
	public RecordRLDisplayItemRenderer() {
		super(new RecordRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(RecordRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordDisplayModel;
import net.mcreator.bendymod.block.display.RecordDisplayItem;

public class RecordDisplayItemRenderer extends GeoItemRenderer<RecordDisplayItem> {
	public RecordDisplayItemRenderer() {
		super(new RecordDisplayModel());
	}

	@Override
	public RenderType getRenderType(RecordDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

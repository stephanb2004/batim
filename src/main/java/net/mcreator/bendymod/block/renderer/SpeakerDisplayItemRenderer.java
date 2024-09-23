package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SpeakerDisplayModel;
import net.mcreator.bendymod.block.display.SpeakerDisplayItem;

public class SpeakerDisplayItemRenderer extends GeoItemRenderer<SpeakerDisplayItem> {
	public SpeakerDisplayItemRenderer() {
		super(new SpeakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpeakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

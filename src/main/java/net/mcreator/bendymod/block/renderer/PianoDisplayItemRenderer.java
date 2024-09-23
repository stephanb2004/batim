package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PianoDisplayModel;
import net.mcreator.bendymod.block.display.PianoDisplayItem;

public class PianoDisplayItemRenderer extends GeoItemRenderer<PianoDisplayItem> {
	public PianoDisplayItemRenderer() {
		super(new PianoDisplayModel());
	}

	@Override
	public RenderType getRenderType(PianoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

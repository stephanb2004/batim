package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalOnDisplayModel;
import net.mcreator.bendymod.block.display.PedestalOnDisplayItem;

public class PedestalOnDisplayItemRenderer extends GeoItemRenderer<PedestalOnDisplayItem> {
	public PedestalOnDisplayItemRenderer() {
		super(new PedestalOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(PedestalOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

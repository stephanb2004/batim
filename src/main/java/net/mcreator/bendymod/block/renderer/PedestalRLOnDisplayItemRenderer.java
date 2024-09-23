package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalRLOnDisplayModel;
import net.mcreator.bendymod.block.display.PedestalRLOnDisplayItem;

public class PedestalRLOnDisplayItemRenderer extends GeoItemRenderer<PedestalRLOnDisplayItem> {
	public PedestalRLOnDisplayItemRenderer() {
		super(new PedestalRLOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(PedestalRLOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

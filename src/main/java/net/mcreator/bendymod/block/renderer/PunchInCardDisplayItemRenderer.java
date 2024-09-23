package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PunchInCardDisplayModel;
import net.mcreator.bendymod.block.display.PunchInCardDisplayItem;

public class PunchInCardDisplayItemRenderer extends GeoItemRenderer<PunchInCardDisplayItem> {
	public PunchInCardDisplayItemRenderer() {
		super(new PunchInCardDisplayModel());
	}

	@Override
	public RenderType getRenderType(PunchInCardDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

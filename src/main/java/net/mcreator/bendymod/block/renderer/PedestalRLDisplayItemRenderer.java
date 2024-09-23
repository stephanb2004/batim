package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalRLDisplayModel;
import net.mcreator.bendymod.block.display.PedestalRLDisplayItem;

public class PedestalRLDisplayItemRenderer extends GeoItemRenderer<PedestalRLDisplayItem> {
	public PedestalRLDisplayItemRenderer() {
		super(new PedestalRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(PedestalRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

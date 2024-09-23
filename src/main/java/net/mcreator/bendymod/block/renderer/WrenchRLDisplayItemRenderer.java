package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WrenchRLDisplayModel;
import net.mcreator.bendymod.block.display.WrenchRLDisplayItem;

public class WrenchRLDisplayItemRenderer extends GeoItemRenderer<WrenchRLDisplayItem> {
	public WrenchRLDisplayItemRenderer() {
		super(new WrenchRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(WrenchRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

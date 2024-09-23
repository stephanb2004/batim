package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskOldDisplayModel;
import net.mcreator.bendymod.block.display.DeskOldDisplayItem;

public class DeskOldDisplayItemRenderer extends GeoItemRenderer<DeskOldDisplayItem> {
	public DeskOldDisplayItemRenderer() {
		super(new DeskOldDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeskOldDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

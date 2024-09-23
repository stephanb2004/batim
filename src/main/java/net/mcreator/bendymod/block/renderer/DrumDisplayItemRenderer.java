package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DrumDisplayModel;
import net.mcreator.bendymod.block.display.DrumDisplayItem;

public class DrumDisplayItemRenderer extends GeoItemRenderer<DrumDisplayItem> {
	public DrumDisplayItemRenderer() {
		super(new DrumDisplayModel());
	}

	@Override
	public RenderType getRenderType(DrumDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InfermaryBedDisplayModel;
import net.mcreator.bendymod.block.display.InfermaryBedDisplayItem;

public class InfermaryBedDisplayItemRenderer extends GeoItemRenderer<InfermaryBedDisplayItem> {
	public InfermaryBedDisplayItemRenderer() {
		super(new InfermaryBedDisplayModel());
	}

	@Override
	public RenderType getRenderType(InfermaryBedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

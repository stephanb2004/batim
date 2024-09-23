package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HatRackDisplayModel;
import net.mcreator.bendymod.block.display.HatRackDisplayItem;

public class HatRackDisplayItemRenderer extends GeoItemRenderer<HatRackDisplayItem> {
	public HatRackDisplayItemRenderer() {
		super(new HatRackDisplayModel());
	}

	@Override
	public RenderType getRenderType(HatRackDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

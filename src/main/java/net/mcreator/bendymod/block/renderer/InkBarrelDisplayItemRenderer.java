package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkBarrelDisplayModel;
import net.mcreator.bendymod.block.display.InkBarrelDisplayItem;

public class InkBarrelDisplayItemRenderer extends GeoItemRenderer<InkBarrelDisplayItem> {
	public InkBarrelDisplayItemRenderer() {
		super(new InkBarrelDisplayModel());
	}

	@Override
	public RenderType getRenderType(InkBarrelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

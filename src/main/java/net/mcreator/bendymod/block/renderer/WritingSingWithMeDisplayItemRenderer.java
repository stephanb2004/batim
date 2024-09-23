package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingSingWithMeDisplayModel;
import net.mcreator.bendymod.block.display.WritingSingWithMeDisplayItem;

public class WritingSingWithMeDisplayItemRenderer extends GeoItemRenderer<WritingSingWithMeDisplayItem> {
	public WritingSingWithMeDisplayItemRenderer() {
		super(new WritingSingWithMeDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingSingWithMeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

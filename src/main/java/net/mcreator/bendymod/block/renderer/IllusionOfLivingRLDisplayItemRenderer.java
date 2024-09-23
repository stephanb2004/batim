package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IllusionOfLivingRLDisplayModel;
import net.mcreator.bendymod.block.display.IllusionOfLivingRLDisplayItem;

public class IllusionOfLivingRLDisplayItemRenderer extends GeoItemRenderer<IllusionOfLivingRLDisplayItem> {
	public IllusionOfLivingRLDisplayItemRenderer() {
		super(new IllusionOfLivingRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(IllusionOfLivingRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

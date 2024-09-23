package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingTheSheepWillComeToSlaughterDisplayModel;
import net.mcreator.bendymod.block.display.WritingTheSheepWillComeToSlaughterDisplayItem;

public class WritingTheSheepWillComeToSlaughterDisplayItemRenderer extends GeoItemRenderer<WritingTheSheepWillComeToSlaughterDisplayItem> {
	public WritingTheSheepWillComeToSlaughterDisplayItemRenderer() {
		super(new WritingTheSheepWillComeToSlaughterDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingTheSheepWillComeToSlaughterDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

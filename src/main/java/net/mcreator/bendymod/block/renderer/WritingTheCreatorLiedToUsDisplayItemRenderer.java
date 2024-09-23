package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingTheCreatorLiedToUsDisplayModel;
import net.mcreator.bendymod.block.display.WritingTheCreatorLiedToUsDisplayItem;

public class WritingTheCreatorLiedToUsDisplayItemRenderer extends GeoItemRenderer<WritingTheCreatorLiedToUsDisplayItem> {
	public WritingTheCreatorLiedToUsDisplayItemRenderer() {
		super(new WritingTheCreatorLiedToUsDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingTheCreatorLiedToUsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

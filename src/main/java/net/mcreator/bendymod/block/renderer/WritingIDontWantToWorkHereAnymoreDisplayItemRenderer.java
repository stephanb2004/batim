package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingIDontWantToWorkHereAnymoreDisplayModel;
import net.mcreator.bendymod.block.display.WritingIDontWantToWorkHereAnymoreDisplayItem;

public class WritingIDontWantToWorkHereAnymoreDisplayItemRenderer extends GeoItemRenderer<WritingIDontWantToWorkHereAnymoreDisplayItem> {
	public WritingIDontWantToWorkHereAnymoreDisplayItemRenderer() {
		super(new WritingIDontWantToWorkHereAnymoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingIDontWantToWorkHereAnymoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

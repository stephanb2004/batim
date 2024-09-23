package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingItsTimeToBelieveDisplayModel;
import net.mcreator.bendymod.block.display.WritingItsTimeToBelieveDisplayItem;

public class WritingItsTimeToBelieveDisplayItemRenderer extends GeoItemRenderer<WritingItsTimeToBelieveDisplayItem> {
	public WritingItsTimeToBelieveDisplayItemRenderer() {
		super(new WritingItsTimeToBelieveDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingItsTimeToBelieveDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

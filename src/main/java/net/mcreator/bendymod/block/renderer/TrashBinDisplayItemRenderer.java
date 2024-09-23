package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.TrashBinDisplayModel;
import net.mcreator.bendymod.block.display.TrashBinDisplayItem;

public class TrashBinDisplayItemRenderer extends GeoItemRenderer<TrashBinDisplayItem> {
	public TrashBinDisplayItemRenderer() {
		super(new TrashBinDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashBinDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

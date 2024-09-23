package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WorkTableDisplayModel;
import net.mcreator.bendymod.block.display.WorkTableDisplayItem;

public class WorkTableDisplayItemRenderer extends GeoItemRenderer<WorkTableDisplayItem> {
	public WorkTableDisplayItemRenderer() {
		super(new WorkTableDisplayModel());
	}

	@Override
	public RenderType getRenderType(WorkTableDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

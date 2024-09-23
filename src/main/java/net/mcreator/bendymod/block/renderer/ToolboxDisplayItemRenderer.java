package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ToolboxDisplayModel;
import net.mcreator.bendymod.block.display.ToolboxDisplayItem;

public class ToolboxDisplayItemRenderer extends GeoItemRenderer<ToolboxDisplayItem> {
	public ToolboxDisplayItemRenderer() {
		super(new ToolboxDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToolboxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

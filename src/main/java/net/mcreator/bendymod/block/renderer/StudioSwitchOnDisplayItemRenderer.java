package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioSwitchOnDisplayModel;
import net.mcreator.bendymod.block.display.StudioSwitchOnDisplayItem;

public class StudioSwitchOnDisplayItemRenderer extends GeoItemRenderer<StudioSwitchOnDisplayItem> {
	public StudioSwitchOnDisplayItemRenderer() {
		super(new StudioSwitchOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StudioSwitchOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioSwitchOffDisplayModel;
import net.mcreator.bendymod.block.display.StudioSwitchOffDisplayItem;

public class StudioSwitchOffDisplayItemRenderer extends GeoItemRenderer<StudioSwitchOffDisplayItem> {
	public StudioSwitchOffDisplayItemRenderer() {
		super(new StudioSwitchOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(StudioSwitchOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

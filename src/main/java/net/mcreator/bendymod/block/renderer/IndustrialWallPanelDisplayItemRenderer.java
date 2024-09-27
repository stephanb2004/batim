package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IndustrialWallPanelDisplayModel;
import net.mcreator.bendymod.block.display.IndustrialWallPanelDisplayItem;

public class IndustrialWallPanelDisplayItemRenderer extends GeoItemRenderer<IndustrialWallPanelDisplayItem> {
	public IndustrialWallPanelDisplayItemRenderer() {
		super(new IndustrialWallPanelDisplayModel());
	}

	@Override
	public RenderType getRenderType(IndustrialWallPanelDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

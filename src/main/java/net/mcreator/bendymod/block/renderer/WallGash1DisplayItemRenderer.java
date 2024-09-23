package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WallGash1DisplayModel;
import net.mcreator.bendymod.block.display.WallGash1DisplayItem;

public class WallGash1DisplayItemRenderer extends GeoItemRenderer<WallGash1DisplayItem> {
	public WallGash1DisplayItemRenderer() {
		super(new WallGash1DisplayModel());
	}

	@Override
	public RenderType getRenderType(WallGash1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

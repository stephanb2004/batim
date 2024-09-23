package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BanjoDisplayModel;
import net.mcreator.bendymod.block.display.BanjoDisplayItem;

public class BanjoDisplayItemRenderer extends GeoItemRenderer<BanjoDisplayItem> {
	public BanjoDisplayItemRenderer() {
		super(new BanjoDisplayModel());
	}

	@Override
	public RenderType getRenderType(BanjoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

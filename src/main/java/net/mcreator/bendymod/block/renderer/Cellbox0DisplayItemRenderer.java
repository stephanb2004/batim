package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox0DisplayModel;
import net.mcreator.bendymod.block.display.Cellbox0DisplayItem;

public class Cellbox0DisplayItemRenderer extends GeoItemRenderer<Cellbox0DisplayItem> {
	public Cellbox0DisplayItemRenderer() {
		super(new Cellbox0DisplayModel());
	}

	@Override
	public RenderType getRenderType(Cellbox0DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

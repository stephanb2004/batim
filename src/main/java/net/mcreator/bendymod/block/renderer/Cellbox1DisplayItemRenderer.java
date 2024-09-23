package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox1DisplayModel;
import net.mcreator.bendymod.block.display.Cellbox1DisplayItem;

public class Cellbox1DisplayItemRenderer extends GeoItemRenderer<Cellbox1DisplayItem> {
	public Cellbox1DisplayItemRenderer() {
		super(new Cellbox1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Cellbox1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

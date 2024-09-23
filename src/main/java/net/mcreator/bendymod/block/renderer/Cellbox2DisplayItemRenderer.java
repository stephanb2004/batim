package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox2DisplayModel;
import net.mcreator.bendymod.block.display.Cellbox2DisplayItem;

public class Cellbox2DisplayItemRenderer extends GeoItemRenderer<Cellbox2DisplayItem> {
	public Cellbox2DisplayItemRenderer() {
		super(new Cellbox2DisplayModel());
	}

	@Override
	public RenderType getRenderType(Cellbox2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

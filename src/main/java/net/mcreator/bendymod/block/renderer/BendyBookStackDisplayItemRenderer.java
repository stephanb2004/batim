package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyBookStackDisplayModel;
import net.mcreator.bendymod.block.display.BendyBookStackDisplayItem;

public class BendyBookStackDisplayItemRenderer extends GeoItemRenderer<BendyBookStackDisplayItem> {
	public BendyBookStackDisplayItemRenderer() {
		super(new BendyBookStackDisplayModel());
	}

	@Override
	public RenderType getRenderType(BendyBookStackDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

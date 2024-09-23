package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyDollRLDisplayModel;
import net.mcreator.bendymod.block.display.BendyDollRLDisplayItem;

public class BendyDollRLDisplayItemRenderer extends GeoItemRenderer<BendyDollRLDisplayItem> {
	public BendyDollRLDisplayItemRenderer() {
		super(new BendyDollRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(BendyDollRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

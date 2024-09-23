package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JDSSignDisplayModel;
import net.mcreator.bendymod.block.display.JDSSignDisplayItem;

public class JDSSignDisplayItemRenderer extends GeoItemRenderer<JDSSignDisplayItem> {
	public JDSSignDisplayItemRenderer() {
		super(new JDSSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(JDSSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

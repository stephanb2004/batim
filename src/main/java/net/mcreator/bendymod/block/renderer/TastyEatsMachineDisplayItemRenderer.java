package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.TastyEatsMachineDisplayModel;
import net.mcreator.bendymod.block.display.TastyEatsMachineDisplayItem;

public class TastyEatsMachineDisplayItemRenderer extends GeoItemRenderer<TastyEatsMachineDisplayItem> {
	public TastyEatsMachineDisplayItemRenderer() {
		super(new TastyEatsMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(TastyEatsMachineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

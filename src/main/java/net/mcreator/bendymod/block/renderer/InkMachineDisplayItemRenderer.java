package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkMachineDisplayModel;
import net.mcreator.bendymod.block.display.InkMachineDisplayItem;

public class InkMachineDisplayItemRenderer extends GeoItemRenderer<InkMachineDisplayItem> {
	public InkMachineDisplayItemRenderer() {
		super(new InkMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(InkMachineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

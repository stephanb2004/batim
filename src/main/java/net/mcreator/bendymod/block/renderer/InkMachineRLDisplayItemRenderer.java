package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkMachineRLDisplayModel;
import net.mcreator.bendymod.block.display.InkMachineRLDisplayItem;

public class InkMachineRLDisplayItemRenderer extends GeoItemRenderer<InkMachineRLDisplayItem> {
	public InkMachineRLDisplayItemRenderer() {
		super(new InkMachineRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(InkMachineRLDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

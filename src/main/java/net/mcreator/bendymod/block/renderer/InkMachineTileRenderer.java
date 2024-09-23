package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkMachineBlockModel;
import net.mcreator.bendymod.block.entity.InkMachineTileEntity;

public class InkMachineTileRenderer extends GeoBlockRenderer<InkMachineTileEntity> {
	public InkMachineTileRenderer() {
		super(new InkMachineBlockModel());
	}

	@Override
	public RenderType getRenderType(InkMachineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

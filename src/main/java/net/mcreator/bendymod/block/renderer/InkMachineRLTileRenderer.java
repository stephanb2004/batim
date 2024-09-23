package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkMachineRLBlockModel;
import net.mcreator.bendymod.block.entity.InkMachineRLTileEntity;

public class InkMachineRLTileRenderer extends GeoBlockRenderer<InkMachineRLTileEntity> {
	public InkMachineRLTileRenderer() {
		super(new InkMachineRLBlockModel());
	}

	@Override
	public RenderType getRenderType(InkMachineRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

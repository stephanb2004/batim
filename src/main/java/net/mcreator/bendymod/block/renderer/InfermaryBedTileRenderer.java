package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InfermaryBedBlockModel;
import net.mcreator.bendymod.block.entity.InfermaryBedTileEntity;

public class InfermaryBedTileRenderer extends GeoBlockRenderer<InfermaryBedTileEntity> {
	public InfermaryBedTileRenderer() {
		super(new InfermaryBedBlockModel());
	}

	@Override
	public RenderType getRenderType(InfermaryBedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

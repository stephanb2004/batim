package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskOldBlockModel;
import net.mcreator.bendymod.block.entity.DeskOldTileEntity;

public class DeskOldTileRenderer extends GeoBlockRenderer<DeskOldTileEntity> {
	public DeskOldTileRenderer() {
		super(new DeskOldBlockModel());
	}

	@Override
	public RenderType getRenderType(DeskOldTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

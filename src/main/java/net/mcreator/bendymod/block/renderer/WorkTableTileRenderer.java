package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WorkTableBlockModel;
import net.mcreator.bendymod.block.entity.WorkTableTileEntity;

public class WorkTableTileRenderer extends GeoBlockRenderer<WorkTableTileEntity> {
	public WorkTableTileRenderer() {
		super(new WorkTableBlockModel());
	}

	@Override
	public RenderType getRenderType(WorkTableTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

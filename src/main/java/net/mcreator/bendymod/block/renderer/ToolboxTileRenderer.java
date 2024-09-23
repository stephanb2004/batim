package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ToolboxBlockModel;
import net.mcreator.bendymod.block.entity.ToolboxTileEntity;

public class ToolboxTileRenderer extends GeoBlockRenderer<ToolboxTileEntity> {
	public ToolboxTileRenderer() {
		super(new ToolboxBlockModel());
	}

	@Override
	public RenderType getRenderType(ToolboxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JumbledPaperBlockModel;
import net.mcreator.bendymod.block.entity.JumbledPaperTileEntity;

public class JumbledPaperTileRenderer extends GeoBlockRenderer<JumbledPaperTileEntity> {
	public JumbledPaperTileRenderer() {
		super(new JumbledPaperBlockModel());
	}

	@Override
	public RenderType getRenderType(JumbledPaperTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

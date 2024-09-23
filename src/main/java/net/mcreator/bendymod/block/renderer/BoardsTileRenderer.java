package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BoardsBlockModel;
import net.mcreator.bendymod.block.entity.BoardsTileEntity;

public class BoardsTileRenderer extends GeoBlockRenderer<BoardsTileEntity> {
	public BoardsTileRenderer() {
		super(new BoardsBlockModel());
	}

	@Override
	public RenderType getRenderType(BoardsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

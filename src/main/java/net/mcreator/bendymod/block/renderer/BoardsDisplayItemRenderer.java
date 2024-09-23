package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BoardsDisplayModel;
import net.mcreator.bendymod.block.display.BoardsDisplayItem;

public class BoardsDisplayItemRenderer extends GeoItemRenderer<BoardsDisplayItem> {
	public BoardsDisplayItemRenderer() {
		super(new BoardsDisplayModel());
	}

	@Override
	public RenderType getRenderType(BoardsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

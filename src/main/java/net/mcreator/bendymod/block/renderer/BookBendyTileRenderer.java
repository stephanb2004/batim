package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BookBendyBlockModel;
import net.mcreator.bendymod.block.entity.BookBendyTileEntity;

public class BookBendyTileRenderer extends GeoBlockRenderer<BookBendyTileEntity> {
	public BookBendyTileRenderer() {
		super(new BookBendyBlockModel());
	}

	@Override
	public RenderType getRenderType(BookBendyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

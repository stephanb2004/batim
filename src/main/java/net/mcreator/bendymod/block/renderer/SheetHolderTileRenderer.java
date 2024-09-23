package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SheetHolderBlockModel;
import net.mcreator.bendymod.block.entity.SheetHolderTileEntity;

public class SheetHolderTileRenderer extends GeoBlockRenderer<SheetHolderTileEntity> {
	public SheetHolderTileRenderer() {
		super(new SheetHolderBlockModel());
	}

	@Override
	public RenderType getRenderType(SheetHolderTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

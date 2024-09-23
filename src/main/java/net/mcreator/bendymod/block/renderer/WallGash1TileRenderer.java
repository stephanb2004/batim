package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WallGash1BlockModel;
import net.mcreator.bendymod.block.entity.WallGash1TileEntity;

public class WallGash1TileRenderer extends GeoBlockRenderer<WallGash1TileEntity> {
	public WallGash1TileRenderer() {
		super(new WallGash1BlockModel());
	}

	@Override
	public RenderType getRenderType(WallGash1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

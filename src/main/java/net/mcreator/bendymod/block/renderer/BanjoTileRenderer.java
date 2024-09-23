package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BanjoBlockModel;
import net.mcreator.bendymod.block.entity.BanjoTileEntity;

public class BanjoTileRenderer extends GeoBlockRenderer<BanjoTileEntity> {
	public BanjoTileRenderer() {
		super(new BanjoBlockModel());
	}

	@Override
	public RenderType getRenderType(BanjoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

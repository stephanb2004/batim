package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WrenchBlockModel;
import net.mcreator.bendymod.block.entity.WrenchTileEntity;

public class WrenchTileRenderer extends GeoBlockRenderer<WrenchTileEntity> {
	public WrenchTileRenderer() {
		super(new WrenchBlockModel());
	}

	@Override
	public RenderType getRenderType(WrenchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

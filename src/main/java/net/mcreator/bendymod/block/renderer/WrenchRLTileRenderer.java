package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WrenchRLBlockModel;
import net.mcreator.bendymod.block.entity.WrenchRLTileEntity;

public class WrenchRLTileRenderer extends GeoBlockRenderer<WrenchRLTileEntity> {
	public WrenchRLTileRenderer() {
		super(new WrenchRLBlockModel());
	}

	@Override
	public RenderType getRenderType(WrenchRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

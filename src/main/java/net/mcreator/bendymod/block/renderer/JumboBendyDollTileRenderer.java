package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JumboBendyDollBlockModel;
import net.mcreator.bendymod.block.entity.JumboBendyDollTileEntity;

public class JumboBendyDollTileRenderer extends GeoBlockRenderer<JumboBendyDollTileEntity> {
	public JumboBendyDollTileRenderer() {
		super(new JumboBendyDollBlockModel());
	}

	@Override
	public RenderType getRenderType(JumboBendyDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

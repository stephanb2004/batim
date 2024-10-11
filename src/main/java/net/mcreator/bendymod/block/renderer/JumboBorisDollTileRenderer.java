package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JumboBorisDollBlockModel;
import net.mcreator.bendymod.block.entity.JumboBorisDollTileEntity;

public class JumboBorisDollTileRenderer extends GeoBlockRenderer<JumboBorisDollTileEntity> {
	public JumboBorisDollTileRenderer() {
		super(new JumboBorisDollBlockModel());
	}

	@Override
	public RenderType getRenderType(JumboBorisDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

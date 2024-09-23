package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JDSSignBlockModel;
import net.mcreator.bendymod.block.entity.JDSSignTileEntity;

public class JDSSignTileRenderer extends GeoBlockRenderer<JDSSignTileEntity> {
	public JDSSignTileRenderer() {
		super(new JDSSignBlockModel());
	}

	@Override
	public RenderType getRenderType(JDSSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

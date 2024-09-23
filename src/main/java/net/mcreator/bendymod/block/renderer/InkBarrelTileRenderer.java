package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkBarrelBlockModel;
import net.mcreator.bendymod.block.entity.InkBarrelTileEntity;

public class InkBarrelTileRenderer extends GeoBlockRenderer<InkBarrelTileEntity> {
	public InkBarrelTileRenderer() {
		super(new InkBarrelBlockModel());
	}

	@Override
	public RenderType getRenderType(InkBarrelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

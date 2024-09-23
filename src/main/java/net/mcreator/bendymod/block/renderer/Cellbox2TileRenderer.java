package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox2BlockModel;
import net.mcreator.bendymod.block.entity.Cellbox2TileEntity;

public class Cellbox2TileRenderer extends GeoBlockRenderer<Cellbox2TileEntity> {
	public Cellbox2TileRenderer() {
		super(new Cellbox2BlockModel());
	}

	@Override
	public RenderType getRenderType(Cellbox2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

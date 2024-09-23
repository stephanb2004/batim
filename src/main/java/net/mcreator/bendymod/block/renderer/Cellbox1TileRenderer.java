package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox1BlockModel;
import net.mcreator.bendymod.block.entity.Cellbox1TileEntity;

public class Cellbox1TileRenderer extends GeoBlockRenderer<Cellbox1TileEntity> {
	public Cellbox1TileRenderer() {
		super(new Cellbox1BlockModel());
	}

	@Override
	public RenderType getRenderType(Cellbox1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

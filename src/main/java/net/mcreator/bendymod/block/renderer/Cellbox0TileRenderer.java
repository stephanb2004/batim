package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox0BlockModel;
import net.mcreator.bendymod.block.entity.Cellbox0TileEntity;

public class Cellbox0TileRenderer extends GeoBlockRenderer<Cellbox0TileEntity> {
	public Cellbox0TileRenderer() {
		super(new Cellbox0BlockModel());
	}

	@Override
	public RenderType getRenderType(Cellbox0TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

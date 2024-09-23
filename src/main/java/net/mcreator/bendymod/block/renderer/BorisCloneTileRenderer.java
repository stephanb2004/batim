package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BorisCloneBlockModel;
import net.mcreator.bendymod.block.entity.BorisCloneTileEntity;

public class BorisCloneTileRenderer extends GeoBlockRenderer<BorisCloneTileEntity> {
	public BorisCloneTileRenderer() {
		super(new BorisCloneBlockModel());
	}

	@Override
	public RenderType getRenderType(BorisCloneTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionBlockModel;
import net.mcreator.bendymod.block.entity.ProjectionTileEntity;

public class ProjectionTileRenderer extends GeoBlockRenderer<ProjectionTileEntity> {
	public ProjectionTileRenderer() {
		super(new ProjectionBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectionTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionBlankBlockModel;
import net.mcreator.bendymod.block.entity.ProjectionBlankTileEntity;

public class ProjectionBlankTileRenderer extends GeoBlockRenderer<ProjectionBlankTileEntity> {
	public ProjectionBlankTileRenderer() {
		super(new ProjectionBlankBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectionBlankTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

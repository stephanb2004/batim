package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectorBlockModel;
import net.mcreator.bendymod.block.entity.ProjectorTileEntity;

public class ProjectorTileRenderer extends GeoBlockRenderer<ProjectorTileEntity> {
	public ProjectorTileRenderer() {
		super(new ProjectorBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

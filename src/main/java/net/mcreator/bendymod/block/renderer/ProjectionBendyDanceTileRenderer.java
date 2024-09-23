package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionBendyDanceBlockModel;
import net.mcreator.bendymod.block.entity.ProjectionBendyDanceTileEntity;

public class ProjectionBendyDanceTileRenderer extends GeoBlockRenderer<ProjectionBendyDanceTileEntity> {
	public ProjectionBendyDanceTileRenderer() {
		super(new ProjectionBendyDanceBlockModel());
	}

	@Override
	public RenderType getRenderType(ProjectionBendyDanceTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

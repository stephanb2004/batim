package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionBendyDanceDisplayModel;
import net.mcreator.bendymod.block.display.ProjectionBendyDanceDisplayItem;

public class ProjectionBendyDanceDisplayItemRenderer extends GeoItemRenderer<ProjectionBendyDanceDisplayItem> {
	public ProjectionBendyDanceDisplayItemRenderer() {
		super(new ProjectionBendyDanceDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProjectionBendyDanceDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

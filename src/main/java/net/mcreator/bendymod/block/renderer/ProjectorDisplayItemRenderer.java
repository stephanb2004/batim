package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectorDisplayModel;
import net.mcreator.bendymod.block.display.ProjectorDisplayItem;

public class ProjectorDisplayItemRenderer extends GeoItemRenderer<ProjectorDisplayItem> {
	public ProjectorDisplayItemRenderer() {
		super(new ProjectorDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProjectorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

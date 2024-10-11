package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingIDontWantToWorkHereAnymoreBlockModel;
import net.mcreator.bendymod.block.entity.WritingIDontWantToWorkHereAnymoreTileEntity;

public class WritingIDontWantToWorkHereAnymoreTileRenderer extends GeoBlockRenderer<WritingIDontWantToWorkHereAnymoreTileEntity> {
	public WritingIDontWantToWorkHereAnymoreTileRenderer() {
		super(new WritingIDontWantToWorkHereAnymoreBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingIDontWantToWorkHereAnymoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.AliceAngelDollDisplayModel;
import net.mcreator.bendymod.block.display.AliceAngelDollDisplayItem;

public class AliceAngelDollDisplayItemRenderer extends GeoItemRenderer<AliceAngelDollDisplayItem> {
	public AliceAngelDollDisplayItemRenderer() {
		super(new AliceAngelDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(AliceAngelDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}


/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bendymod.fluid.InkFluid;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BendymodMod.MODID);
	public static final RegistryObject<FlowingFluid> INK = REGISTRY.register("ink", () -> new InkFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_INK = REGISTRY.register("flowing_ink", () -> new InkFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(INK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_INK.get(), RenderType.translucent());
		}
	}
}

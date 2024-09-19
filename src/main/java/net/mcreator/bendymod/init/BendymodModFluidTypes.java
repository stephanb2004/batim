
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.bendymod.fluid.types.InkRLFluidType;
import net.mcreator.bendymod.fluid.types.InkFluidType;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BendymodMod.MODID);
	public static final RegistryObject<FluidType> INK_TYPE = REGISTRY.register("ink", () -> new InkFluidType());
	public static final RegistryObject<FluidType> INK_RL_TYPE = REGISTRY.register("ink_rl", () -> new InkRLFluidType());
}

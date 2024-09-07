
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.bendymod.world.biome.TheStudioBiome;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BendymodMod.MODID);
	public static final RegistryObject<Biome> THE_STUDIO = REGISTRY.register("the_studio", TheStudioBiome::createBiome);
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.bendymod.world.features.JoeysApartmentFeature;
import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber
public class BendymodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BendymodMod.MODID);
	public static final RegistryObject<Feature<?>> JOEYS_APARTMENT = REGISTRY.register("joeys_apartment", JoeysApartmentFeature::feature);
}

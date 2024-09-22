
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.BendymodMod;

public class BendymodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BendymodMod.MODID);
	public static final RegistryObject<SoundEvent> INKDEMON_FOOTSTEP = REGISTRY.register("inkdemon_footstep", () -> new SoundEvent(new ResourceLocation("bendymod", "inkdemon_footstep")));
	public static final RegistryObject<SoundEvent> INKDEMON_NEAR = REGISTRY.register("inkdemon_near", () -> new SoundEvent(new ResourceLocation("bendymod", "inkdemon_near")));
	public static final RegistryObject<SoundEvent> SAMMY_FOOTSTEP = REGISTRY.register("sammy_footstep", () -> new SoundEvent(new ResourceLocation("bendymod", "sammy_footstep")));
	public static final RegistryObject<SoundEvent> SEARCHER_APPEAR = REGISTRY.register("searcher_appear", () -> new SoundEvent(new ResourceLocation("bendymod", "searcher_appear")));
	public static final RegistryObject<SoundEvent> SEARCHER_AMBIENT = REGISTRY.register("searcher_ambient", () -> new SoundEvent(new ResourceLocation("bendymod", "searcher_ambient")));
	public static final RegistryObject<SoundEvent> SEARCHER_ATTACK = REGISTRY.register("searcher_attack", () -> new SoundEvent(new ResourceLocation("bendymod", "searcher_attack")));
	public static final RegistryObject<SoundEvent> SEARCHER_DIE = REGISTRY.register("searcher_die", () -> new SoundEvent(new ResourceLocation("bendymod", "searcher_die")));
	public static final RegistryObject<SoundEvent> SEARCHER_HIT = REGISTRY.register("searcher_hit", () -> new SoundEvent(new ResourceLocation("bendymod", "searcher_hit")));
	public static final RegistryObject<SoundEvent> SAMMY_HIT = REGISTRY.register("sammy_hit", () -> new SoundEvent(new ResourceLocation("bendymod", "sammy_hit")));
	public static final RegistryObject<SoundEvent> INKDEMON_CHASE = REGISTRY.register("inkdemon_chase", () -> new SoundEvent(new ResourceLocation("bendymod", "inkdemon_chase")));
	public static final RegistryObject<SoundEvent> VIOLIN_NOTE = REGISTRY.register("violin_note", () -> new SoundEvent(new ResourceLocation("bendymod", "violin_note")));
	public static final RegistryObject<SoundEvent> BENDYDOLL_SQUEAK = REGISTRY.register("bendydoll_squeak", () -> new SoundEvent(new ResourceLocation("bendymod", "bendydoll_squeak")));
	public static final RegistryObject<SoundEvent> RADIO_1 = REGISTRY.register("radio_1", () -> new SoundEvent(new ResourceLocation("bendymod", "radio_1")));
	public static final RegistryObject<SoundEvent> RADIO_2 = REGISTRY.register("radio_2", () -> new SoundEvent(new ResourceLocation("bendymod", "radio_2")));
	public static final RegistryObject<SoundEvent> SAMMY_AMBIENCE = REGISTRY.register("sammy_ambience", () -> new SoundEvent(new ResourceLocation("bendymod", "sammy_ambience")));
	public static final RegistryObject<SoundEvent> STUDIOAMBIENCE_LOOP = REGISTRY.register("studioambience_loop", () -> new SoundEvent(new ResourceLocation("bendymod", "studioambience_loop")));
	public static final RegistryObject<SoundEvent> STUDIOAMBIENCE_ADDITIONALSOUNDS = REGISTRY.register("studioambience_additionalsounds", () -> new SoundEvent(new ResourceLocation("bendymod", "studioambience_additionalsounds")));
	public static final RegistryObject<SoundEvent> RADIO_3 = REGISTRY.register("radio_3", () -> new SoundEvent(new ResourceLocation("bendymod", "radio_3")));
	public static final RegistryObject<SoundEvent> RADIO_4 = REGISTRY.register("radio_4", () -> new SoundEvent(new ResourceLocation("bendymod", "radio_4")));
}

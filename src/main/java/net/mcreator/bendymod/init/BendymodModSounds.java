
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
	public static final RegistryObject<SoundEvent> INKDEMON_FOOTSTEP = REGISTRY.register("inkdemon_footstep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "inkdemon_footstep")));
	public static final RegistryObject<SoundEvent> INKDEMON_NEAR = REGISTRY.register("inkdemon_near", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "inkdemon_near")));
	public static final RegistryObject<SoundEvent> SAMMY_FOOTSTEP = REGISTRY.register("sammy_footstep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "sammy_footstep")));
	public static final RegistryObject<SoundEvent> SEARCHER_APPEAR = REGISTRY.register("searcher_appear", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "searcher_appear")));
	public static final RegistryObject<SoundEvent> SEARCHER_AMBIENT = REGISTRY.register("searcher_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "searcher_ambient")));
	public static final RegistryObject<SoundEvent> SEARCHER_ATTACK = REGISTRY.register("searcher_attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "searcher_attack")));
	public static final RegistryObject<SoundEvent> SEARCHER_DIE = REGISTRY.register("searcher_die", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "searcher_die")));
	public static final RegistryObject<SoundEvent> SEARCHER_HIT = REGISTRY.register("searcher_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "searcher_hit")));
	public static final RegistryObject<SoundEvent> SAMMY_HIT = REGISTRY.register("sammy_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "sammy_hit")));
	public static final RegistryObject<SoundEvent> INKDEMON_CHASE = REGISTRY.register("inkdemon_chase", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "inkdemon_chase")));
	public static final RegistryObject<SoundEvent> VIOLIN_NOTE = REGISTRY.register("violin_note", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "violin_note")));
	public static final RegistryObject<SoundEvent> BENDYDOLL_SQUEAK = REGISTRY.register("bendydoll_squeak", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "bendydoll_squeak")));
	public static final RegistryObject<SoundEvent> RADIO_1 = REGISTRY.register("radio_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "radio_1")));
	public static final RegistryObject<SoundEvent> RADIO_2 = REGISTRY.register("radio_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "radio_2")));
	public static final RegistryObject<SoundEvent> SAMMY_AMBIENCE = REGISTRY.register("sammy_ambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "sammy_ambience")));
	public static final RegistryObject<SoundEvent> STUDIOAMBIENCE_LOOP = REGISTRY.register("studioambience_loop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "studioambience_loop")));
	public static final RegistryObject<SoundEvent> STUDIOAMBIENCE_ADDITIONALSOUNDS = REGISTRY.register("studioambience_additionalsounds", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "studioambience_additionalsounds")));
	public static final RegistryObject<SoundEvent> RADIO_3 = REGISTRY.register("radio_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "radio_3")));
	public static final RegistryObject<SoundEvent> RADIO_4 = REGISTRY.register("radio_4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bendymod", "radio_4")));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BendymodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> INK_DEMON_TELEPORT_MODE = GameRules.register("inkDemonTeleportMode", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> INK_DEMON_TIMER_MINIMUM = GameRules.register("inkDemonTimerMinimum", GameRules.Category.PLAYER, GameRules.IntegerValue.create(6000));
	public static final GameRules.Key<GameRules.IntegerValue> INK_DEMON_TIMER_MAXIMUM = GameRules.register("inkDemonTimerMaximum", GameRules.Category.PLAYER, GameRules.IntegerValue.create(15600));
	public static final GameRules.Key<GameRules.BooleanValue> ALLOW_MULTIPLE_INK_BENDYS = GameRules.register("allowMultipleInkBendys", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> SEARCHER_SPAWN_MAX = GameRules.register("searcherSpawnMax", GameRules.Category.PLAYER, GameRules.IntegerValue.create(5));
}

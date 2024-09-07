
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BendymodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> INK_DEMON_TELEPORT_MODE = GameRules.register("inkDemonTeleportMode", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
}

package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;

import net.mcreator.bendymod.init.BendymodModGameRules;

import java.util.ArrayList;

public class ChooseRandomPlayerProcedure {
	public static Entity execute(LevelAccessor world) {
		Entity selected_player = null;
		double player_count = 0;
		double aaaa = 0;
		double bbbb = 0;
		while (selected_player == null) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bendymod:studio")))) {
					if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.INK_DEMON_TELEPORT_MODE) == true) {
						if (new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
								} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
								}
								return false;
							}
						}.checkGamemode(entityiterator)) {
							aaaa = Mth.nextInt(RandomSource.create(), 1, 3);
							if (aaaa == 2) {
								selected_player = entityiterator;
							}
						}
					} else {
						aaaa = Mth.nextInt(RandomSource.create(), 1, 3);
						if (aaaa == 2) {
							selected_player = entityiterator;
						}
					}
				}
			}
		}
		return selected_player;
	}
}

package net.mcreator.bendymod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.entity.InkBendyEntity;
import net.mcreator.bendymod.BendymodMod;

public class InkBendyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity selected_player = null;
		double random_x = 0;
		double random_z = 0;
		double random_letter = 0;
		double random2 = 0;
		double target_x = 0;
		double target_z = 0;
		boolean hiding = false;
		boolean did_chase_animation = false;
		boolean overrid = false;
		boolean selected_loc = false;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 9999, false, false));
		if (!(null == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 1, false, false));
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload add ~ ~ ~ ~");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 16), y, (z + 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload remove ~ ~ ~ ~");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 16), y, (z - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload remove ~ ~ ~ ~");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 16), y, (z + 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload remove ~ ~ ~ ~");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x - 16), y, (z - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload remove ~ ~ ~ ~");
		BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining + 5;
		BendymodModVariables.MapVariables.get(world).syncData(world);
		if (BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining == BendymodModVariables.MapVariables.get(world).ink_bendy_timer) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
				selected_player = ChooseRandomPlayerProcedure.execute(world);
				if (!(selected_player == null)) {
					while (selected_loc == false) {
						random2 = Mth.nextInt(RandomSource.create(), 1, 4);
						if (random2 == 1) {
							random_x = selected_player.getX() + Mth.nextInt(RandomSource.create(), 8, 13);
						} else if (random2 == 2) {
							random_x = selected_player.getX() - Mth.nextInt(RandomSource.create(), 8, 13);
						} else if (random2 == 3) {
							random_x = selected_player.getX() + Mth.nextInt(RandomSource.create(), 0, 2);
						} else if (random2 == 4) {
							random_x = selected_player.getX() - Mth.nextInt(RandomSource.create(), 0, 2);
						}
						random2 = Mth.nextInt(RandomSource.create(), 1, 4);
						if (random2 == 1) {
							random_z = selected_player.getX() + Mth.nextInt(RandomSource.create(), 8, 13);
						} else if (random2 == 2) {
							random_z = selected_player.getX() - Mth.nextInt(RandomSource.create(), 8, 13);
						} else if (random2 == 3) {
							random_z = selected_player.getZ() + Mth.nextInt(RandomSource.create(), 0, 2);
						} else if (random2 == 4) {
							random_z = selected_player.getZ() - Mth.nextInt(RandomSource.create(), 0, 2);
						}
						target_x = selected_player.getX();
						target_z = selected_player.getZ();
						if ((world.getBlockState(new BlockPos(random_x, selected_player.getY(), random_z))).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(random_x, selected_player.getY() - 1, random_z)).canOcclude()) {
							selected_loc = true;
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(random_x, (selected_player.getY()), random_z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(random_x, (selected_player.getY()), random_z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(target_x, y, target_z, 1);
					BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
					BendymodModVariables.MapVariables.get(world).syncData(world);
				} else {
					BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
					BendymodModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				BendymodModVariables.MapVariables.get(world).ink_bendy_timer = Mth.nextInt(RandomSource.create(), 30000, 78000);
				BendymodModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() instanceof LiquidBlock && (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == BendymodModBlocks.INK.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, false));
			if (entity.getPersistentData().getBoolean("hidden") == false && !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty())
					&& !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (entity instanceof InkBendyEntity) {
					((InkBendyEntity) entity).setAnimation("animation.inkbendy.hide");
				}
				BendymodMod.queueServerWork(25, () -> {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 25, 1, false, false));
					entity.getPersistentData().putBoolean("hidden", true);
				});
			} else if (entity.getPersistentData().getBoolean("hidden") == true && !(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty())
					&& !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 25, 1, false, false));
			} else if (entity.getPersistentData().getBoolean("hidden") == true && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()
					|| !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
				if (entity instanceof InkBendyEntity) {
					((InkBendyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof InkBendyEntity) {
					((InkBendyEntity) entity).setAnimation("animation.inkbendy.appear");
				}
				BendymodMod.queueServerWork(25, () -> {
					if (entity instanceof InkBendyEntity) {
						((InkBendyEntity) entity).setAnimation("empty");
					}
					entity.getPersistentData().putBoolean("hidden", false);
				});
			}
		} else {
			entity.getPersistentData().putBoolean("hidden", false);
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && did_chase_animation == false) {
			if (entity instanceof InkBendyEntity) {
				((InkBendyEntity) entity).setAnimation("animation.inkbendy.see");
			}
			entity.setTicksFrozen(28);
			if (world.isClientSide()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:inkdemon_chase")), SoundSource.MUSIC, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:inkdemon_chase")), SoundSource.MUSIC, 1, 1, false);
					}
				}
			}
			BendymodMod.queueServerWork(28, () -> {
				if (entity instanceof InkBendyEntity) {
					((InkBendyEntity) entity).setAnimation("empty");
				}
			});
		} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a * bendymod:inkdemon_chase");
			overrid = false;
			did_chase_animation = false;
			hiding = false;
		}
	}
}

package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModGameRules;
import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.entity.InkBendyEntity;
import net.mcreator.bendymod.BendymodMod;

import java.util.Comparator;

public class InkBendyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity selected_player = null;
		boolean hiding = false;
		boolean did_chase_animation = false;
		boolean overrid = false;
		boolean selected_loc = false;
		boolean played_song = false;
		boolean selected_inkdemon = false;
		double random_x = 0;
		double random_z = 0;
		double random_letter = 0;
		double random2 = 0;
		double target_x = 0;
		double target_z = 0;
		double range_distance = 0;
		double chance = 0;
		double aaaaaaaa = 0;
		if (entity instanceof LivingEntity) {
			if (selected_inkdemon == false) {
				if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_INK_BENDYS) == false) {
					if (BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected == false) {
						BendymodModVariables.MapVariables.get(world).ink_bendy_timer = Mth.nextInt(RandomSource.create(), (world.getLevelData().getGameRules().getInt(BendymodModGameRules.INK_DEMON_TIMER_MINIMUM)),
								(world.getLevelData().getGameRules().getInt(BendymodModGameRules.INK_DEMON_TIMER_MAXIMUM)));
						BendymodModVariables.MapVariables.get(world).syncData(world);
						BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected = true;
						BendymodModVariables.MapVariables.get(world).syncData(world);
						entity.getPersistentData().putBoolean("cur_inkbendy", true);
						selected_inkdemon = true;
					} else {
						entity.getPersistentData().putBoolean("cur_inkbendy", false);
						selected_inkdemon = true;
					}
				}
			}
			range_distance = 201;
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 9999, false, false));
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 1, false, false));
			}
			if (entity.getPersistentData().getBoolean("cur_inkbendy") == true) {
				BendymodModVariables.MapVariables.get(world).cur_inkdemon_x = x;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				BendymodModVariables.MapVariables.get(world).cur_inkdemon_y = y;
				BendymodModVariables.MapVariables.get(world).syncData(world);
				BendymodModVariables.MapVariables.get(world).cur_inkdemon_z = z;
				BendymodModVariables.MapVariables.get(world).syncData(world);
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
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					entity.getPersistentData().putBoolean("can_be_teleported", false);
				} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)
						&& BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining >= BendymodModVariables.MapVariables.get(world).ink_bendy_timer) {
					entity.getPersistentData().putBoolean("can_be_teleported", true);
				} else if (BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining < BendymodModVariables.MapVariables.get(world).ink_bendy_timer || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) {
					entity.getPersistentData().putBoolean("can_be_teleported", false);
				}
				BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining + 1;
				BendymodModVariables.MapVariables.get(world).syncData(world);
			} else {
				if ((!world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3(x, y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3(x, y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, z), 400, 400, 400), e -> true).isEmpty()
						|| !world.getEntitiesOfClass(InkBendyEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, z), 400, 400, 400), e -> true).isEmpty())
						&& world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_INK_BENDYS) == false) {
					if (((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
							AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z), 16, 16, 16),
							e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z)).findFirst()
							.orElse(null)) instanceof LivingEntity) {
						if (((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
								AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z), 16, 16, 16),
								e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z)).findFirst()
								.orElse(null)).getPersistentData().getBoolean("can_be_teleported") == true) {
							aaaaaaaa = Mth.nextInt(RandomSource.create(), 1, 7);
							if (aaaaaaaa == 2) {
								{
									Entity _ent = ((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
											AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z),
													16, 16, 16),
											e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z))
											.findFirst().orElse(null));
									_ent.teleportTo(x, y, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
								}
								BendymodModVariables.MapVariables.get(world).ink_bendy_time_remaining = 0;
								BendymodModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() instanceof LiquidBlock && (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == BendymodModBlocks.INK.get()) {
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
						|| (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
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
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && did_chase_animation == false) {
				if (entity instanceof InkBendyEntity) {
					((InkBendyEntity) entity).setAnimation("animation.inkbendy.see");
				}
				if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_INK_BENDYS) == true || played_song == false && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"playsound bendymod:inkdemon_chase ambient @a[distance=..35] ~ ~ ~");
					played_song = true;
				}
				entity.setTicksFrozen(28);
				BendymodMod.queueServerWork(28, () -> {
					if (entity instanceof InkBendyEntity) {
						((InkBendyEntity) entity).setAnimation("empty");
					}
				});
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player)) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a * bendymod:inkdemon_chase");
				played_song = false;
				overrid = false;
				did_chase_animation = false;
				hiding = false;
			}
		}
	}
}

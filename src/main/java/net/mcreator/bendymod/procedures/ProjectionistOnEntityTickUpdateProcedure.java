package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModGameRules;
import net.mcreator.bendymod.entity.ProjectionistEntity;

import java.util.Comparator;

public class ProjectionistOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double range_distance = 0;
		double aaaaaaaa = 0;
		boolean played_song = false;
		boolean hiding = false;
		boolean overrid = false;
		boolean selected_inkdemon = false;
		boolean did_chase_animation = false;
		boolean selected_projectionist = false;
		boolean yelled = false;
		if (selected_projectionist == false) {
			if (world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_PROJECTIONISTS) == false) {
				if (BendymodModVariables.MapVariables.get(world).cur_projectionist_selected == false) {
					BendymodModVariables.MapVariables.get(world).cur_projectionist_selected = true;
					BendymodModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putBoolean("cur_projectionist", true);
					BendymodModVariables.MapVariables.get(world).cur_projectionist_selected = true;
					BendymodModVariables.MapVariables.get(world).syncData(world);
				} else {
					entity.getPersistentData().putBoolean("cur_projectionist", false);
					BendymodModVariables.MapVariables.get(world).cur_projectionist_selected = true;
					BendymodModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
		range_distance = 201;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (IsTargetHidingProcedure.execute(entity) == true) {
				if (entity instanceof Mob) {
					try {
						((Mob) entity).setTarget(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("cur_projectionist") == true) {
			BendymodModVariables.MapVariables.get(world).cur_projectionist_x = x;
			BendymodModVariables.MapVariables.get(world).syncData(world);
			BendymodModVariables.MapVariables.get(world).cur_projectionist_y = y;
			BendymodModVariables.MapVariables.get(world).syncData(world);
			BendymodModVariables.MapVariables.get(world).cur_projectionist_z = z;
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
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.getPersistentData().putBoolean("can_be_teleported", false);
			} else {
				entity.getPersistentData().putBoolean("can_be_teleported", true);
			}
		} else {
			if ((!world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3(x, y, (z + range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3(x, y, (z - range_distance)), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x + range_distance), y, z), 400, 400, 400), e -> true).isEmpty()
					|| !world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(new Vec3((x - range_distance), y, z), 400, 400, 400), e -> true).isEmpty())
					&& world.getLevelData().getGameRules().getBoolean(BendymodModGameRules.ALLOW_MULTIPLE_INK_BENDYS) == false) {
				if (((Entity) world.getEntitiesOfClass(ProjectionistEntity.class,
						AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z), 16,
								16, 16),
						e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z)).findFirst()
						.orElse(null)) instanceof LivingEntity) {
					if (((Entity) world.getEntitiesOfClass(ProjectionistEntity.class,
							AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z),
									16, 16, 16),
							e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z))
							.findFirst().orElse(null)).getPersistentData().getBoolean("can_be_teleported") == true) {
						{
							Entity _ent = ((Entity) world.getEntitiesOfClass(ProjectionistEntity.class, AABB.ofSize(
									new Vec3(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z), 16,
									16, 16), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_projectionist_x, BendymodModVariables.MapVariables.get(world).cur_projectionist_y, BendymodModVariables.MapVariables.get(world).cur_projectionist_z))
									.findFirst().orElse(null));
							_ent.teleportTo(x, y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}

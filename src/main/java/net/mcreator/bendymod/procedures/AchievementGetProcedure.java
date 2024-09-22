package net.mcreator.bendymod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.entity.InkBendyEntity;

import javax.annotation.Nullable;

import java.util.Iterator;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AchievementGetProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("bendymod:studio")))) {
			if (entity.getY() == 306 && !(entity.getPersistentData().getDouble("floor") == 1)) {
				if (!(entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel && _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:the_old_song"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:moving_pictures"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"title @p actionbar {\"text\":\"LEVEL 0\",\"bold\":true}");
				entity.getPersistentData().putDouble("floor", 1);
			} else if (entity.getY() == 290 && !(entity.getPersistentData().getDouble("floor") == 2)) {
				if (!(entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
						&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:the_old_song"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:the_old_song"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"title @p actionbar {\"text\":\"LEVEL A\",\"bold\":true}");
				entity.getPersistentData().putDouble("floor", 2);
			}
			if (BendymodModVariables.MapVariables.get(world).cur_inkdemon_selected == true) {
				if (((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
						AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z), 4, 4, 4), e -> true)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z)).findFirst()
						.orElse(null)) instanceof LivingEntity
						&& (((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
								AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z), 4, 4, 4),
								e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z)).findFirst()
								.orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					if ((((Entity) world.getEntitiesOfClass(InkBendyEntity.class,
							AABB.ofSize(new Vec3(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z), 4, 4, 4),
							e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(BendymodModVariables.MapVariables.get(world).cur_inkdemon_x, BendymodModVariables.MapVariables.get(world).cur_inkdemon_y, BendymodModVariables.MapVariables.get(world).cur_inkdemon_z)).findFirst()
							.orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
						if (!(entity instanceof ServerPlayer _plr29 && _plr29.level instanceof ServerLevel
								&& _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:you_cannot_hide_forever"))).isDone())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("bendymod:you_cannot_hide_forever"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
					}
				}
			}
		}
	}
}

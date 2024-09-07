package net.mcreator.bendymod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AchievementTitleShowProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level, event.getAdvancement(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Advancement advancement, Entity entity) {
		execute(null, world, advancement, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement, Entity entity) {
		if (advancement == null || entity == null)
			return;
		if (world instanceof Level _lvl && _lvl.getServer() != null ? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("bendymod:moving_pictures")).equals(advancement) : false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"title @p title {\"text\":\"MOVING PICTURES\",\"bold\":true,\"italic\":true}");
		} else if (world instanceof Level _lvl && _lvl.getServer() != null ? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("bendymod:the_old_song")).equals(advancement) : false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"title @p title {\"text\":\"THE OLD SONG\",\"bold\":true,\"italic\":true}");
		}
	}
}

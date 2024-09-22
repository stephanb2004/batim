
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bendymod.entity.SitEntityEntity;
import net.mcreator.bendymod.entity.SearcherEntity;
import net.mcreator.bendymod.entity.SammyLawrenceEntity;
import net.mcreator.bendymod.entity.InkBendyEntity;
import net.mcreator.bendymod.entity.BorisBuddyEntity;
import net.mcreator.bendymod.entity.BendyEntity;
import net.mcreator.bendymod.entity.BaconSoupEmptyEntity;
import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BendymodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BendymodMod.MODID);
	public static final RegistryObject<EntityType<BaconSoupEmptyEntity>> BACON_SOUP_EMPTY = register("projectile_bacon_soup_empty",
			EntityType.Builder.<BaconSoupEmptyEntity>of(BaconSoupEmptyEntity::new, MobCategory.MISC).setCustomClientFactory(BaconSoupEmptyEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BendyEntity>> BENDY = register("bendy",
			EntityType.Builder.<BendyEntity>of(BendyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BendyEntity::new)

					.sized(0.3125f, 1.8125f));
	public static final RegistryObject<EntityType<BorisBuddyEntity>> BORIS_BUDDY = register("boris_buddy",
			EntityType.Builder.<BorisBuddyEntity>of(BorisBuddyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BorisBuddyEntity::new)

					.sized(0.75f, 2.1875f));
	public static final RegistryObject<EntityType<SearcherEntity>> SEARCHER = register("searcher",
			EntityType.Builder.<SearcherEntity>of(SearcherEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SearcherEntity::new)

					.sized(0.95f, 0.875f));
	public static final RegistryObject<EntityType<InkBendyEntity>> INK_BENDY = register("ink_bendy",
			EntityType.Builder.<InkBendyEntity>of(InkBendyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InkBendyEntity::new).fireImmune().sized(0.5f, 1.75f));
	public static final RegistryObject<EntityType<SammyLawrenceEntity>> SAMMY_LAWRENCE = register("sammy_lawrence",
			EntityType.Builder.<SammyLawrenceEntity>of(SammyLawrenceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SammyLawrenceEntity::new)

					.sized(0.3125f, 1.8125f));
	public static final RegistryObject<EntityType<SitEntityEntity>> SIT_ENTITY = register("sit_entity", EntityType.Builder.<SitEntityEntity>of(SitEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(SitEntityEntity::new).fireImmune().sized(0.5f, 0.35f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BendyEntity.init();
			BorisBuddyEntity.init();
			SearcherEntity.init();
			InkBendyEntity.init();
			SammyLawrenceEntity.init();
			SitEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BENDY.get(), BendyEntity.createAttributes().build());
		event.put(BORIS_BUDDY.get(), BorisBuddyEntity.createAttributes().build());
		event.put(SEARCHER.get(), SearcherEntity.createAttributes().build());
		event.put(INK_BENDY.get(), InkBendyEntity.createAttributes().build());
		event.put(SAMMY_LAWRENCE.get(), SammyLawrenceEntity.createAttributes().build());
		event.put(SIT_ENTITY.get(), SitEntityEntity.createAttributes().build());
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bendymod.item.StudioAxeItem;
import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;
import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BendymodMod.MODID);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL = block(BendymodModBlocks.STUDIO_BLANK_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_STAIRS = block(BendymodModBlocks.STUDIO_BLANK_WALL_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_BLANK_WALL_SLAB = block(BendymodModBlocks.STUDIO_BLANK_WALL_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL = block(BendymodModBlocks.STUDIO_PLANKED_WALL, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_PLANKED_WALL_BROKEN = block(BendymodModBlocks.STUDIO_PLANKED_WALL_BROKEN, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_CEILING = block(BendymodModBlocks.STUDIO_CEILING, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR = block(BendymodModBlocks.STUDIO_FLOOR, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_STAIRS = block(BendymodModBlocks.STUDIO_FLOOR_STAIRS, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR_SLAB = block(BendymodModBlocks.STUDIO_FLOOR_SLAB, BendymodModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> BENDY_SPAWN_EGG = REGISTRY.register("bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.BENDY, -15724785, -12955, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> BORIS_BUDDY_SPAWN_EGG = REGISTRY.register("boris_buddy_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.BORIS_BUDDY, -15724785, -1587590, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SEARCHER_SPAWN_EGG = REGISTRY.register("searcher_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.SEARCHER, -16579837, -15790578, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> INK_BENDY_SPAWN_EGG = REGISTRY.register("ink_bendy_spawn_egg", () -> new ForgeSpawnEggItem(BendymodModEntities.INK_BENDY, -15724785, -21220, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> SAMMY_LAWRENCE_SPAWN_EGG = REGISTRY.register("sammy_lawrence_spawn_egg",
			() -> new ForgeSpawnEggItem(BendymodModEntities.SAMMY_LAWRENCE, -16579837, -3365807, new Item.Properties().tab(BendymodModTabs.TAB_BENDY_ENTITIES)));
	public static final RegistryObject<Item> STUDIO_AXE = REGISTRY.register("studio_axe", () -> new StudioAxeItem());
	public static final RegistryObject<Item> CUTOUT_BENDY = REGISTRY.register(BendymodModBlocks.CUTOUT_BENDY.getId().getPath(),
			() -> new CutoutBendyDisplayItem(BendymodModBlocks.CUTOUT_BENDY.get(), new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> CUTOUT_SINNY = REGISTRY.register(BendymodModBlocks.CUTOUT_SINNY.getId().getPath(), () -> new CutoutSinnyDisplayItem(BendymodModBlocks.CUTOUT_SINNY.get(), new Item.Properties().tab(null)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BendymodModTabs {
	public static CreativeModeTab TAB_BENDY_BLOCKS;
	public static CreativeModeTab TAB_BENDY_ENTITIES;
	public static CreativeModeTab TAB_BENDY_PROPS;

	public static void load() {
		TAB_BENDY_BLOCKS = new CreativeModeTab("tabbendy_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BendymodModBlocks.STUDIO_FLOOR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BENDY_ENTITIES = new CreativeModeTab("tabbendy_entities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BendymodModItems.BENDY_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BENDY_PROPS = new CreativeModeTab("tabbendy_props") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BendymodModItems.STUDIO_AXE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

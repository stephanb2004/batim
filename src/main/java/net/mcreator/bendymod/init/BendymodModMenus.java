
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.bendymod.world.inventory.CrateInventoryMenu;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BendymodMod.MODID);
	public static final RegistryObject<MenuType<CrateInventoryMenu>> CRATE_INVENTORY = REGISTRY.register("crate_inventory", () -> IForgeMenuType.create(CrateInventoryMenu::new));
}

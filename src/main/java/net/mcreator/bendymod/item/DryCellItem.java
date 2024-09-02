
package net.mcreator.bendymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.bendymod.init.BendymodModTabs;

public class DryCellItem extends Item {
	public DryCellItem() {
		super(new Item.Properties().tab(BendymodModTabs.TAB_BENDY_PROPS).stacksTo(64).rarity(Rarity.COMMON));
	}
}

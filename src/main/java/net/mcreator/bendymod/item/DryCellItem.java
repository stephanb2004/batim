
package net.mcreator.bendymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DryCellItem extends Item {
	public DryCellItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

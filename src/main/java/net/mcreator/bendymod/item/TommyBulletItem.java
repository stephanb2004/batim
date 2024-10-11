
package net.mcreator.bendymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TommyBulletItem extends Item {
	public TommyBulletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

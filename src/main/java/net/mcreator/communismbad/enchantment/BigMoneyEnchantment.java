
package net.mcreator.communismbad.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class BigMoneyEnchantment extends Enchantment {
	public BigMoneyEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public int getMaxLevel() {
		return 10;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.WOODEN_SHOVEL)
			return true;
		if (stack.getItem() == Items.WOODEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.WOODEN_AXE)
			return true;
		if (stack.getItem() == Items.WOODEN_HOE)
			return true;
		if (stack.getItem() == Items.STONE_SWORD)
			return true;
		if (stack.getItem() == Items.STONE_SHOVEL)
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.STONE_AXE)
			return true;
		if (stack.getItem() == Items.STONE_HOE)
			return true;
		if (stack.getItem() == Items.IRON_SWORD)
			return true;
		if (stack.getItem() == Items.IRON_SHOVEL)
			return true;
		if (stack.getItem() == Items.IRON_PICKAXE)
			return true;
		if (stack.getItem() == Items.IRON_AXE)
			return true;
		if (stack.getItem() == Items.IRON_HOE)
			return true;
		if (stack.getItem() == Items.SHEARS)
			return true;
		if (stack.getItem() == Items.GOLDEN_SWORD)
			return true;
		if (stack.getItem() == Items.GOLDEN_SHOVEL)
			return true;
		if (stack.getItem() == Items.GOLDEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_AXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_HOE)
			return true;
		if (stack.getItem() == Items.DIAMOND_SWORD)
			return true;
		if (stack.getItem() == Items.DIAMOND_SHOVEL)
			return true;
		if (stack.getItem() == Items.DIAMOND_PICKAXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_AXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_HOE)
			return true;
		if (stack.getItem() == Items.NETHERITE_SWORD)
			return true;
		if (stack.getItem() == Items.NETHERITE_SHOVEL)
			return true;
		if (stack.getItem() == Items.NETHERITE_PICKAXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_AXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_HOE)
			return true;
		if (stack.getItem() == Items.STICK)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}

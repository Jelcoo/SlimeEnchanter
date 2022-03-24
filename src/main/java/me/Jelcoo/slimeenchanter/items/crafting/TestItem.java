package me.Jelcoo.slimeenchanter.items.crafting;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.Jelcoo.slimeenchanter.items.ItemGroups;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class TestItem extends SlimefunItem {
	public TestItem() {
		super(
				ItemGroups.CRAFTING_MATERIALS,
				new SlimefunItemStack(
					"TEST_ITEM",
					Material.COMPASS,
					"&eTest Item",
					"", "&fLore"
				),
				RecipeType.ENHANCED_CRAFTING_TABLE,
				new ItemStack[]{
						null, SlimefunItems.STEEL_INGOT, null,
						SlimefunItems.STEEL_INGOT, null, SlimefunItems.STEEL_INGOT,
						null, SlimefunItems.STEEL_INGOT, null
				}
		);
	}
}

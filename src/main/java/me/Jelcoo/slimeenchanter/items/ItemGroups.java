package me.Jelcoo.slimeenchanter.items;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.Jelcoo.slimeenchanter.SlimeEnchanter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class ItemGroups {
    public static final NestedItemGroup CRAFTING_MATERIALS = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "crafting_materials"),
        new CustomItemStack(
            new ItemStack(Material.BLACK_STAINED_GLASS),
            "&aCrafting Materials"
        )
    );

    static {
        final SlimeEnchanter plugin = SlimeEnchanter.getInstance();

        // Register Categories
        ItemGroups.CRAFTING_MATERIALS.register(plugin);
    }
}

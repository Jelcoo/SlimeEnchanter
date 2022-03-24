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
    public static final NestedItemGroup ENCHANTMENTS_SWORD = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_sword"),
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_SWORD),
            "&aSword"
        )
    );
    public static final NestedItemGroup ENCHANTMENTS_TOOLS = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_tools"),
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_PICKAXE),
            "&aTools"
        )
    );
    public static final NestedItemGroup ENCHANTMENTS_ARMOR = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_armor"),
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_CHESTPLATE),
            "&aArmor"
        )
    );
    public static final NestedItemGroup ENCHANTMENTS_BOWS = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_bows"),
        new CustomItemStack(
            new ItemStack(Material.BOW),
            "&aBow"
        )
    );
    public static final NestedItemGroup ENCHANTMENTS_OTHER = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_other"),
        new CustomItemStack(
            new ItemStack(Material.FISHING_ROD),
            "&aOther"
        )
    );

    static {
        final SlimeEnchanter plugin = SlimeEnchanter.getInstance();

        // Register Categories
        CRAFTING_MATERIALS.register(plugin);
        ENCHANTMENTS_SWORD.register(plugin);
        ENCHANTMENTS_TOOLS.register(plugin);
        ENCHANTMENTS_ARMOR.register(plugin);
        ENCHANTMENTS_BOWS.register(plugin);
        ENCHANTMENTS_OTHER.register(plugin);
    }
}

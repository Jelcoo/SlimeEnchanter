package me.Jelcoo.slimeenchanter.items;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.Jelcoo.slimeenchanter.SlimeEnchanter;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class ItemGroups {
    public static NestedItemGroup itemGroup = new NestedItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "slimeenchanter"),
        new CustomItemStack(
            Material.ENCHANTED_BOOK,
            "&4SlimeEnchanter",
            "", "&a> Click to open"
        )
    );

    public static final SubItemGroup CRAFTING_MATERIALS = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "crafting_materials"),
        itemGroup,
        new CustomItemStack(
            new ItemStack(Material.CRAFTING_TABLE),
            "&aCrafting Materials"
        )
    );
    public static final SubItemGroup ENCHANTMENTS_SWORD = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_sword"),
        itemGroup,
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_SWORD),
            "&aSword"
        )
    );
    public static final SubItemGroup ENCHANTMENTS_TOOLS = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_tools"),
        itemGroup,
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_PICKAXE),
            "&aTools"
        )
    );
    public static final SubItemGroup ENCHANTMENTS_ARMOR = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_armor"),
        itemGroup,
        new CustomItemStack(
            new ItemStack(Material.DIAMOND_CHESTPLATE),
            "&aArmor"
        )
    );
    public static final SubItemGroup ENCHANTMENTS_BOWS = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_bows"),
        itemGroup,
        new CustomItemStack(
            new ItemStack(Material.BOW),
            "&aBow"
        )
    );
    public static final SubItemGroup ENCHANTMENTS_OTHER = new SubItemGroup(
        new NamespacedKey(SlimeEnchanter.getInstance(), "enchantments_other"),
        itemGroup,
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

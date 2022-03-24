package me.Jelcoo.slimeenchanter.items;

import me.Jelcoo.slimeenchanter.SlimeEnchanter;
import me.Jelcoo.slimeenchanter.items.crafting.TestItem;

public class ItemLoader {
    public static void load() {
        SlimeEnchanter plugin = SlimeEnchanter.getInstance();

        // Register items
        new TestItem().register(plugin);
    }
}

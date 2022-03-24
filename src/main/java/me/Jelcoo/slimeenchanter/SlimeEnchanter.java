package me.Jelcoo.slimeenchanter;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.Jelcoo.slimeenchanter.items.ItemLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class SlimeEnchanter extends JavaPlugin implements SlimefunAddon {

    private static SlimeEnchanter instance;

    @Override
    public void onEnable() {
        instance = this;

        ItemLoader.load();
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Jelcoo/electrification/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static SlimeEnchanter getInstance() {
        return SlimeEnchanter.instance;
    }
}

package me.dreamix.dboatfixer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DBoatFixer extends JavaPlugin {

    public static DBoatFixer instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getCommand("dfix").setExecutor(new FixCommand());
        Bukkit.getPluginManager().registerEvents(new FixListener(), this);
    }

}

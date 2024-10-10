package com.joaoguedes.jotagefirstplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jotagefirstplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled!");

        getServer().getPluginManager().registerEvents(new ItemPickupListener(), this);
    }
}

package com.joaoguedes.jotagefirstplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jotagefirstplugin extends JavaPlugin {
    private boolean notifyPickupEnabled = true;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled!");

        getServer().getPluginManager().registerEvents(new ItemPickupListener(this), this);

        getCommand("fp").setExecutor(new TogglePluginCommand(this));
    }

    public boolean isNotifyPickupEnabled() {
        return notifyPickupEnabled;
    }

    public void setNotifyPickupEnabled(boolean enabled) {
        this.notifyPickupEnabled = enabled;
    }
}

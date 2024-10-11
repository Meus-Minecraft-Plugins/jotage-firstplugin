package com.joaoguedes.jotagefirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TogglePluginCommand implements CommandExecutor {
    private final Jotagefirstplugin plugin;

    public TogglePluginCommand(Jotagefirstplugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        plugin.setNotifyPickupEnabled(!(plugin.isNotifyPickupEnabled()));

        String status = plugin.isNotifyPickupEnabled() ? plugin.getConfig().getString("message-enabled") : plugin.getConfig().getString("message-disabled");
        commandSender.sendMessage(plugin.isNotifyPickupEnabled() ? "§a" + status : "§c" + status);

        return true;
    }
}

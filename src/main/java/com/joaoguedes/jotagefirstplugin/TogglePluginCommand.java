package com.joaoguedes.jotagefirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TogglePluginCommand implements CommandExecutor {
    private final Jotagefirstplugin plugin;

    public TogglePluginCommand(Jotagefirstplugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 1) {
                if (strings[0].equals("ligar")) {
                    plugin.setNotifyPickupEnabled(true);
                    commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("message-enabled")));
                } else if (strings[0].equals("desligar")) {
                    plugin.setNotifyPickupEnabled(false);
                    commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("message-disabled")));
                }
            }
        }
        return true;
    }
}

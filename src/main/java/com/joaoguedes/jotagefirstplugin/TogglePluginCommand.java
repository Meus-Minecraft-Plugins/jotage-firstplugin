package com.joaoguedes.jotagefirstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TogglePluginCommand implements CommandExecutor {
    private final Jotagefirstplugin plugin;

    public TogglePluginCommand(Jotagefirstplugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 0) {
                return false;
            }
            switch (strings[0]) {
                case "ligar":
                    plugin.setNotifyPickupEnabled(true);
                    commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("message-enabled")));
                    break;
                case "desligar":
                    plugin.setNotifyPickupEnabled(false);
                    commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("message-disabled")));
                    break;
                case "reload":
                    plugin.reloadConfig();
                    commandSender.sendMessage("§3[JotaGe-FirstPlugin] Reloaded!");
                    break;
                default:
                    commandSender.sendMessage("§cComando desconhecido. Use: /fp <ligar | desligar | reload>");
                    break;
            }
            return true;
        } else {
            commandSender.sendMessage("§3[JotaGe-FirstPlugin] O Comando pode ser executado apenas por players!");
            return true;
        }
    }
}

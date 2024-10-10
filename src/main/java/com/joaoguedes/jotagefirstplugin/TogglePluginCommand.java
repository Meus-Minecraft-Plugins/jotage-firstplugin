package com.joaoguedes.jotagefirstplugin;

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

        String status = plugin.isNotifyPickupEnabled() ? "§aativada" : "§cdesativada";
        commandSender.sendMessage("§aA notificação de coleta de itens está agora " + status + "!");

        return true;
    }
}

package com.joaoguedes.jotagefirstplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class ItemPickupListener implements Listener {
    private final Jotagefirstplugin plugin;

    public ItemPickupListener(Jotagefirstplugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPickUpItem(EntityPickupItemEvent e) {
        if (e.getEntity() instanceof Player) {
            if (plugin.isNotifyPickupEnabled()) {
                Player player = (Player) e.getEntity();

                Material itemType = e.getItem().getItemStack().getType();

                player.sendMessage("§aVocê coletou: §6§l" + itemType.name());
            }
        }
    }
}

package com.hiyurin.antilavacast.Events;

import com.hiyurin.antilavacast.AntiLavaCast;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class NoLavaCast implements Listener {
    private final AntiLavaCast plugin;

    public NoLavaCast(AntiLavaCast plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onStoneForm(BlockFormEvent e) {
        if (!plugin.isPluginEnabled()) {
            return;
        }

        if (e.getNewState().getType() == Material.COBBLESTONE) {
            if (e.getBlock().getType() == Material.LAVA) {
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
            }
        }
    }
}

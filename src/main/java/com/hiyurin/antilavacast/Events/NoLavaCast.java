package com.hiyurin.antilavacast.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class NoLavaCast implements Listener {
    @EventHandler
    public void onStoneForm(BlockFormEvent e) {
        if (e.getNewState().getType() == Material.COBBLESTONE) {
            if (e.getBlock().getType() == Material.LAVA) {
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
            }
        }
    }
}

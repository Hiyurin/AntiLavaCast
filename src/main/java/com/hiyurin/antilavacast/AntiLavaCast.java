package com.hiyurin.antilavacast;

import com.hiyurin.antilavacast.Commands.AntiLavaCastCommand;
import com.hiyurin.antilavacast.Events.NoLavaCast;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiLavaCast extends JavaPlugin {
    private boolean isEnabled = true;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoLavaCast(this), this);

        PluginCommand command = getCommand("antilavacast");
        if (command != null) {
            AntiLavaCastCommand commandExecutor = new AntiLavaCastCommand(this);
            command.setExecutor(commandExecutor);
            command.setTabCompleter(commandExecutor);
        } else {
            getLogger().severe("Command /antilavacast not found in plugin.yml");
        }

        getLogger().info("AntiLavaCast plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiLavaCast plugin has been disabled!");
    }

    public boolean isPluginEnabled() {
        return isEnabled;
    }

    public void setPluginEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }
}

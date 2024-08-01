package com.hiyurin.antilavacast.Commands;

import com.hiyurin.antilavacast.AntiLavaCast;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.List;

public class AntiLavaCastCommand implements CommandExecutor, TabCompleter {
    private final AntiLavaCast plugin;

    public AntiLavaCastCommand(AntiLavaCast plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Usage: /antilavacast <on|off>");
            return false;
        }

        if (args[0].equalsIgnoreCase("on")) {
            plugin.setPluginEnabled(true);
            sender.sendMessage("AntiLavaCast has been enabled.");
        } else if (args[0].equalsIgnoreCase("off")) {
            plugin.setPluginEnabled(false);
            sender.sendMessage("AntiLavaCast has been disabled.");
        } else {
            sender.sendMessage("Usage: /antilavacast <on|off>");
            return false;
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return Arrays.asList("on", "off");
        }
        return null;
    }
}
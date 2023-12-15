package dev.sylus.theblockingdead.commands;

import dev.sylus.theblockingdead.items.ItemsManager;
import dev.sylus.theblockingdead.items.PistolShot;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class GiveGun implements CommandExecutor {
    ItemsManager itemsManager;
    public GiveGun(ItemsManager itemsManagerInstance){ // Constructor
        itemsManager = itemsManagerInstance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
            Bukkit.getLogger().log(Level.WARNING, "Non player tried to use a player only command");
            return true;
        }
        sender.sendMessage(ChatColor.RED + "Trying to create trail");
        itemsManager.getItem(args[0]);
        return true;
    }
}

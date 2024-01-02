package dev.sylus.theblockingdead.commands;

import dev.sylus.theblockingdead.enums.WeaponsENUM;
import dev.sylus.theblockingdead.items.ItemsManager;
import dev.sylus.theblockingdead.items.PistolShot;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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
        } else if (args[0] == null) {
            sender.sendMessage(ChatColor.RED + "Please specify a gun");
        }
        ItemStack gun = itemsManager.getWeapon(WeaponsENUM.valueOf(args[0]));
        return true;
    }
}

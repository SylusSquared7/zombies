package dev.sylus.theblockingdead.commands;

import dev.sylus.theblockingdead.items.PistolShot;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class ParticleTest implements CommandExecutor {
    PistolShot pistolShot;
    public ParticleTest(PistolShot pistolShotInstance){ // Constructor
        pistolShot = pistolShotInstance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Only players can use this command");
            Bukkit.getLogger().log(Level.WARNING, "Non player tried to use a player only command");
            return true;
        }
        sender.sendMessage(ChatColor.RED + "Trying to create trail");
        pistolShot.shoot((LivingEntity) sender);
        return true;
    }
}

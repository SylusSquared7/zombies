package dev.sylus.theblockingdead;

import dev.sylus.theblockingdead.commands.GiveGun;
import dev.sylus.theblockingdead.commands.ParticleTest;
import dev.sylus.theblockingdead.items.ItemsManager;
import dev.sylus.theblockingdead.items.PistolShot;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheBlockingDead extends JavaPlugin {
    PistolShot pistolShot;
    ItemsManager itemsManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        pistolShot = new PistolShot();
        itemsManager = new ItemsManager();

        // Events

        // Commands
        getCommand("particleTest").setExecutor(new ParticleTest(pistolShot));
        getCommand("giveGun").setExecutor(new GiveGun(itemsManager));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package dev.sylus.theblockingdead;

import dev.sylus.theblockingdead.commands.ParticleTest;
import dev.sylus.theblockingdead.items.PistolShot;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheBlockingDead extends JavaPlugin {
    PistolShot pistolShot;

    @Override
    public void onEnable() {
        // Plugin startup logic
        pistolShot = new PistolShot();

        // Events

        // Commands
        getCommand("particleTest").setExecutor(new ParticleTest(pistolShot));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package dev.sylus.theblockingdead.items;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Particle;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class PistolShot {
    public PistolShot(){

    }
    public void shoot(LivingEntity player){
        drawParticleLine(player, 10);
        World world = player.getWorld();
        Location location = player.getEyeLocation();

       // world.spawnArrow(location, );
    }

    private void drawParticleLine(LivingEntity targetPlayer, int particleCount) {
        World world = targetPlayer.getWorld();
        Vector playerLocVector = targetPlayer.getLocation().toVector();
        Vector targetLocVector = getLooking(targetPlayer, 10).toVector();
        Vector betweenPandTVector = targetLocVector.clone().subtract(playerLocVector);
        Vector directionVector = betweenPandTVector.clone().normalize();

        for (int i = 0; i < particleCount; i++) {
            Vector particlePoint = playerLocVector.clone().add(directionVector.clone().multiply(i));
            Location particleLocation = particlePoint.toLocation(world);

            world.playEffect(particleLocation, Effect.FIREWORKS_SPARK, 0);
        }

      //  Arrow arrow = world.spawnArrow(targetPlayer.getLocation(), playerLocVector, 1, 1);
      //  arrow.setShooter(targetPlayer);
      //  arrow.setVelocity();

    }

    private Location getLooking(LivingEntity livingEntity, double distance){
        Location eyeLocation = livingEntity.getEyeLocation();
        Vector direction = eyeLocation.getDirection();
        Vector scaledDirection = direction.clone().normalize().multiply(distance);
        World world = eyeLocation.getWorld();

        double x = scaledDirection.getX() + eyeLocation.getX();
        double y = scaledDirection.getY() + eyeLocation.getY();
        double z = scaledDirection.getZ() + eyeLocation.getZ();
        return new Location(world, x, y, z);
    }

}

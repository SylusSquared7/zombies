package dev.sylus.theblockingdead.items;

import dev.sylus.theblockingdead.enums.WeaponsENUM;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class ItemsManager {
    Weapons weapons;

    public ItemsManager(){
        weapons = new Weapons();
    }

    public void getWeapon(WeaponsENUM weaponName){
        weapons.getWeapon(weaponName);
    }
    public void getItem(){

    }
}

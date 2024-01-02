package dev.sylus.theblockingdead.items;

import dev.sylus.theblockingdead.enums.WeaponsENUM;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class ItemsManager {
    Weapons weapons;

    public ItemsManager(){
        weapons = new Weapons();
    }

    public ItemStack getWeapon(WeaponsENUM weaponName){
       return weapons.getWeapon(weaponName);
    }
    public void getItem(String itemName){

    }
}

package dev.sylus.theblockingdead.items;

import dev.sylus.theblockingdead.enums.WeaponsENUM;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Weapons {
    Map<WeaponsENUM, ItemStack> weaponsMap = new HashMap<>();

    public Weapons(){
        initialiseGuns();
    }

    private void initialiseGuns(){
        ItemStack item = new ItemStack(Material.DIAMOND_SPADE); // Shotgun
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.setDisplayName("Shotgun");
        List<String> lore = new ArrayList<>();
        lore.add("§7Shoots a bunch of bullets at once (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        weaponsMap.put(WeaponsENUM.SHOTGUN, item);

        item = new ItemStack(Material.GOLD_SPADE); // Pistol
        itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.setDisplayName("Pistol");
        lore = new ArrayList<>();
        lore.add("§7Accurate but fires slow (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        weaponsMap.put(WeaponsENUM.PISTOL, item);

        item = new ItemStack(Material.IRON_SPADE); // M14 (Machine Gun)
        itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.setDisplayName("M14");
        lore = new ArrayList<>();
        lore.add("§7Inaccurate but fires fast (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        weaponsMap.put(WeaponsENUM.M14, item);

        item = new ItemStack(Material.DIAMOND_AXE); // M14 (Machine Gun)
        itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.setDisplayName("§cAdmins weapon");
        lore = new ArrayList<>();
        lore.add("§7Truly the weapon of an admin (CHANGE THIS)");
        lore.add("§cADMIN WEAPON");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        weaponsMap.put(WeaponsENUM.ADMINSWORD, item);

        item = new ItemStack(Material.IRON_AXE); // M14 (Machine Gun)
        itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.spigot().setUnbreakable(true);
        itemMeta.setDisplayName("Knife");
        lore = new ArrayList<>();
        lore.add("§7Limited durability but does a lot of damage (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        weaponsMap.put(WeaponsENUM.ADMINSWORD, item);
    }

    public ItemStack getWeapon(WeaponsENUM weaponName){
        return weaponsMap.get(weaponName);
    }
}

package dev.sylus.theblockingdead.items;

import dev.sylus.theblockingdead.enums.ItemsENUM;
import dev.sylus.theblockingdead.enums.WeaponsENUM;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Items {
    Map<ItemsENUM, ItemStack> itemsMap = new HashMap<>();

    public Items(){
        initialiseItems();
    }

    public void initialiseItems(){
        ItemStack item = new ItemStack(Material.GHAST_TEAR); // Pistol ammo
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Pistol ammo");
        List<String> lore = new ArrayList<>();
        lore.add("§fAmmo for the pistol (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.PISTOLAMMO, item);

        item = new ItemStack(Material.ARROW); // M14 ammo
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("M14 ammo");
        lore = new ArrayList<>();
        lore.add("§fAmmo for the M14 (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.M14AMMO, item);

        item = new ItemStack(Material.NETHER_WARTS); // Shotgun ammo
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Shotgun ammo");
        lore = new ArrayList<>();
        lore.add("§fAmmo for the shotgun (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.SHOTGUNAMMO, item);

        item = new ItemStack(Material.COOKED_CHICKEN); // Fried chicken
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Fried chicken");
        lore = new ArrayList<>();
        lore.add("§fIts a chicken drumstick (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.FRIEDCHICKEN, item);

        item = new ItemStack(Material.POTION); // Medkit
        PotionMeta potionMeta = (PotionMeta) item.getItemMeta();
        potionMeta.setDisplayName("Health kit");
        potionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 1, 2), true);
        lore = new ArrayList<>();
        lore.add("§fRestores 5 hearts (CHANGE THIS)");
        potionMeta.setLore(lore);
        item.setItemMeta(potionMeta);
        itemsMap.put(ItemsENUM.HEALTHKIT, item);

        item = new ItemStack(Material.LEATHER_HELMET); // Riot helmet
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Riot helmet");
        lore = new ArrayList<>();
        lore.add("§f+1 armour (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.HELMET, item);

        item = new ItemStack(Material.LEATHER_CHESTPLATE); // Riot helmet
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Riot chestplate");
        lore = new ArrayList<>();
        lore.add("§f+3 armour (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.CHESTPLATE, item);

        item = new ItemStack(Material.LEATHER_LEGGINGS); // Riot helmet
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Riot leggings");
        lore = new ArrayList<>();
        lore.add("§f+2 armour (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.LEGGINGS, item);

        item = new ItemStack(Material.LEATHER_CHESTPLATE); // Riot helmet
        itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Riot boots");
        lore = new ArrayList<>();
        lore.add("§f+1 armour (CHANGE THIS)");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        itemsMap.put(ItemsENUM.BOOTS, item);
    }
}

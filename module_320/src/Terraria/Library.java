package Terraria;
/**
 * @author kay
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    final public List<Entry> entries = new ArrayList<>();

    public List<Entry> getEntries() {
        return entries;
    }

    public void printEntries() {
        for (Entry entry : getEntries()) {
            System.out.println(entry.getName());
            System.out.println(entry.getDescription());
            System.out.println("-----------------------------");
        }
    }

    public void printNPCs() {
        for (Entry entry : entries) {

            switch (entry.type) {
                case "mob", "villager", "boss" -> {
                    NPC npc = (NPC) entry;
                    System.out.println("-----------------------------");
                    System.out.println("Name: " + npc.name);
                    System.out.println("Description: " + npc.description);
                    System.out.println("Type: " + npc.type);
                    System.out.println("Rarity: " + npc.rarity);
                    System.out.println("Rarity: " + npc.friendly);
                    System.out.println("Rarity: " + npc.health);
                    if (Objects.equals(npc.type, "mob")) {
                        Mob mob = (Mob) npc;
                        System.out.println("Attack Damage: " + mob.attack_damage);
                        System.out.println("Biomes: " + mob.biomes);
                    } else if (Objects.equals(npc.type, "villager")) {
                        Villager villager = (Villager) npc;
                        System.out.println("Likes environment: " + villager.likes_environment);
                    } else if (Objects.equals(npc.type, "boss")) {
                        Boss boss = (Boss) npc;
                        System.out.println("Incantation Item: " + boss.incantation_item);
                        System.out.println("Stages: " + boss.stages);
                        System.out.println("Attack Damage: " + boss.attack_damage);

                    }
                }
            }
        }
    }

    public void printItems() {
        for (Entry entry : entries) {
            if (Objects.equals(entry.type, "armor") || Objects.equals(entry.type, "portion") ||
                    Objects.equals(entry.type, "weapon") || Objects.equals(entry.type, "gadget")) {
                Item item = (Item) entry;

                System.out.println("-----------------------------");
                System.out.println("Name: " + item.name);
                System.out.println("Description: " + item.description);
                System.out.println("Type: " + item.type);
                System.out.println("Rarity: " + item.rarity);
                System.out.println("Obtained By: " + item.obtained_by.name);
                System.out.println("Selling Price: " + item.selling_price);

                if (Objects.equals(item.type, "armor")) {
                    Armor armor = (Armor) item;
                    System.out.println("Durability: " + armor.durability);
                    System.out.println("Defence: " + armor.defence);
                } else if (Objects.equals(item.type, "weapon")) {
                    Weapon weapon = (Weapon) item;
                    System.out.println("Attack Damage: " + weapon.attack_damage);
                    System.out.println("Durability: " + weapon.durability);
                } else if (Objects.equals(item.type, "potion")) {
                    Potion potion = (Potion) item;
                    System.out.println("Effect: " + potion.effect);
                    System.out.println("Duration: " + potion.duration);

                }
            }
        }
    }

    public void printEntryDetails() {
        printItems();
        printNPCs();
    }

    public void newMob(String type, String name, String description, String rarity, boolean friendly,
                       int health, int attack_damage, String biome, Library library) {
        Mob mob = new Mob(name, description, rarity, friendly, health, attack_damage, biome, type);
        library.entries.add(mob);
    }

    public void newVillager(String type, String name, String description, String rarity, boolean friendly,
                            int health, boolean likes_environment, Library library) {
        Villager villager = new Villager(name, description, rarity, friendly, health, likes_environment, type);
        library.entries.add(villager);

    }

    public void newBoss(String type, String name, String description, String rarity, boolean friendly,
                        int health, int attack_damage, String incantation_items, String stages, Library library) {
        Boss boss = new Boss(name, description, rarity, friendly, health, attack_damage, incantation_items, stages, type);
        library.entries.add(boss);
    }

    public void newArmor(String type, String name, String description, String rarity, NPC obtained_by,
                         float selling_price, int defence, int durability, Library library) {
        Armor armor = new Armor(name, description, rarity, obtained_by, selling_price, defence, durability, type);
        library.entries.add(armor);
    }

    public void newPotion(String type, String name, String description, String rarity, NPC obtained_by,
                          float selling_price, String effect, int duration, Library library) {
        Potion potion = new Potion(name, description, rarity, obtained_by, selling_price, effect, duration, type);
        library.entries.add(potion);
    }

    public void newGadget(String type, String name, String description, String rarity, NPC obtained_by,
                          float selling_price, String buff, Library library) {
        Gadget gadget = new Gadget(name, description, rarity, obtained_by, selling_price, buff, type);
        library.entries.add(gadget);
    }

    public void newWeapon(String type, String name, String description, String rarity, NPC obtained_by,
                          float selling_price, int attack_damage, int durability, Library library) {
        Weapon weapon = new Weapon(name, description, rarity, obtained_by, selling_price, attack_damage, durability, type);
        library.entries.add(weapon);
    }

    public void deleteItem(String name, Library library) {
        library.entries.removeIf(entry -> Objects.equals(entry.name, name));
    }
}

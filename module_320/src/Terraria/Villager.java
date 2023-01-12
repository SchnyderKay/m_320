package Terraria;

public class Villager extends NPC{
    boolean likes_environment;

    public Villager(String name, String description, String rarity, boolean friendly, int health, boolean likes_environment) {
        super(name, description, rarity, friendly, health);
        this.likes_environment = likes_environment;
    }
}

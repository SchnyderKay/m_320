package Terraria;

public class Villager extends NPC{
    final boolean likes_environment;

    public Villager(String name, String description, String rarity, boolean friendly,
                    int health, boolean likes_environment, String type) {
        super(name, description, rarity, friendly, health, type);
        this.likes_environment = likes_environment;
    }
}

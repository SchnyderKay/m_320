package Terraria;

public class Mob extends NPC{
    int attack_damage;
    String biomes;

    public Mob(String name, String description, String rarity, boolean friendly, int health, int attack_damage, String biome) {
        super(name, description, rarity, friendly, health);
        this.attack_damage = attack_damage;
        this.biomes = biome;
    }
}

package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Mob extends NPC {
    final int attack_damage;
    final String biomes;

    public Mob(String name, String description, String rarity, boolean friendly,
               int health, int attack_damage, String biome, String type) {
        super(name, description, rarity, friendly, health, type);
        this.attack_damage = attack_damage;
        this.biomes = biome;
    }
}

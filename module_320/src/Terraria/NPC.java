package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class NPC extends Entry {
    final boolean friendly;
    final int health;

    public NPC(String name, String description, String rarity,
               boolean friendly, int health, String type) {
        super(name, description, rarity, type);
        this.friendly = friendly;
        this.health = health;
    }
}

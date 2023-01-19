package Terraria;

public class Boss extends NPC{
    final int attack_damage;
    final String incantation_item;
    final String stages;

    public Boss(String name, String description, String rarity, boolean friendly, int health,
                int attack_damage, String incantation_item, String stages, String type) {
        super(name, description, rarity, friendly, health, type);
        this.attack_damage = attack_damage;
        this.incantation_item = incantation_item;
        this.stages = stages;
    }
}

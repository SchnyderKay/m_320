package Terraria;

public class Weapon extends Item{
    int attack_damage;
    int durability;

    public Weapon(String name, String description, String rarity, NPC obtained_by, float selling_price, int attack_damage, int durability) {
        super(name, description, rarity, obtained_by, selling_price);
        this.attack_damage = attack_damage;
        this.durability = durability;
    }

    public int getAttack_damage() {
        return attack_damage;
    }

    public void setAttack_damage(int attack_damage) {
        this.attack_damage = attack_damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}


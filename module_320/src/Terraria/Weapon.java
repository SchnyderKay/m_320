package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Weapon extends Item {
    final int attack_damage;
    final int durability;

    public Weapon(String name, String description, String rarity, NPC obtained_by, float selling_price,
                  int attack_damage, int durability, String type) {
        super(name, description, rarity, obtained_by, selling_price, type);
        this.attack_damage = attack_damage;
        this.durability = durability;
    }

    @Override
    public void getDescriptionOfType() {
        System.out.println("This is a weapon, which is used to subtract health from an NCP.");
    }
}


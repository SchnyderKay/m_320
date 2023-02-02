package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Armor extends Item{
    final int defence;
    final int durability;

    public Armor(String name, String description, String rarity, NPC obtained_by,
                 float selling_price, int defence, int durability, String type) {
        super(name, description, rarity, obtained_by, selling_price, type);
        this.defence = defence;
        this.durability = durability;
    }

    @Override
    public void getDescriptionOfType() {
        System.out.println("This is an armor and it helps you get less damage from a mob or a boss.");
    }
}


package Terraria;

public class Armor extends Item{
    int defence;
    int durability;

    public Armor(String name, String description, String rarity, NPC obtained_by, float selling_price, int defence, int durability) {
        super(name, description, rarity, obtained_by, selling_price);
        this.defence = defence;
        this.durability = durability;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}


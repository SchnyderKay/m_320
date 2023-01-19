package Terraria;

public class Potion extends Item{
    final String effect;
    final int duration;

    public Potion(String name, String description, String rarity, NPC obtained_by,
                  float selling_price, String effect, int duration, String type) {
        super(name, description, rarity, obtained_by, selling_price, type);
        this.effect = effect;
        this.duration = duration;
    }

    @Override
    public void getDescriptionOfType() {
        System.out.println("This is a potion and you can use it to get additional semi permanent effects.");
    }
}

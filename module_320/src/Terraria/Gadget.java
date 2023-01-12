package Terraria;

public class Gadget extends Item{
    int duration;

    public Gadget(String name, String description, String rarity, NPC obtained_by, float selling_price, int duration) {
        super(name, description, rarity, obtained_by, selling_price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

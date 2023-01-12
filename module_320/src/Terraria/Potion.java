package Terraria;

public class Potion extends Item{
    String effect;
    int duration;

    public Potion(String name, String description, String rarity, NPC obtained_by, float selling_price, String effect, int duration) {
        super(name, description, rarity, obtained_by, selling_price);
        this.effect = effect;
        this.duration = duration;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

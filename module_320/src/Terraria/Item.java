package Terraria;

public class Item extends Entry{
    NPC obtained_by;
    float selling_price;

    public Item(String name, String description, String rarity, NPC obtained_by, float selling_price) {
        super(name, description, rarity);
        this.obtained_by = obtained_by;
        this.selling_price = selling_price;
    }

    public NPC getObtained_by() {
        return obtained_by;
    }

    public void setObtained_by(NPC obtained_by) {
        this.obtained_by = obtained_by;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(float selling_price) {
        this.selling_price = selling_price;
    }
}

package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Item extends Entry {
    final NPC obtained_by;
    final float selling_price;

    public Item(String name, String description, String rarity, NPC obtained_by,
                float selling_price, String type) {
        super(name, description, rarity, type);
        this.obtained_by = obtained_by;
        this.selling_price = selling_price;
    }

    public void getDescriptionOfType() {
        System.out.println("This is an item, which is obtained by an NCP and will be used by the character.");
    }
}

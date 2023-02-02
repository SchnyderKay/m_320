package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Gadget extends Item {
    final String buff;

    public Gadget(String name, String description, String rarity, NPC obtained_by,
                  float selling_price, String buff, String type) {
        super(name, description, rarity, obtained_by, selling_price, type);
        this.buff = buff;
    }

    @Override
    public void getDescriptionOfType() {
        System.out.println("This is a gadget and it will give you a buff as long as you carry it.");
    }
}

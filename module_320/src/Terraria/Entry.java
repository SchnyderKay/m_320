package Terraria;

/**
 * @author kay
 * @version 1.0
 */
public class Entry {
    String name;
    String description;
    String rarity;
    String type;

    public Entry(String name, String description, String rarity, String type) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

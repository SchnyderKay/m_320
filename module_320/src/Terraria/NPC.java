package Terraria;

public class NPC extends Entry{
    boolean friendly;
    int health;

    public NPC(String name, String description, String rarity, boolean friendly, int health) {
        super(name, description, rarity);
        this.friendly = friendly;
        this.health = health;
    }

    public boolean getFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

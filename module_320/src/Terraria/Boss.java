package Terraria;

public class Boss extends NPC{
    int attack_damage;
    String incantation_item;
    String stages;

    public Boss(String name, String description, String rarity, boolean friendly, int health, int attack_damage, String incantation_item, String stages) {
        super(name, description, rarity, friendly, health);
        this.attack_damage = attack_damage;
        this.incantation_item = incantation_item;
        this.stages = stages;
    }

    public int getAttack_damage() {
        return attack_damage;
    }

    public void setAttack_damage(int attack_damage) {
        this.attack_damage = attack_damage;
    }

    public String getIncantation_item() {
        return incantation_item;
    }

    public void setIncantation_item(String incantation_item) {
        this.incantation_item = incantation_item;
    }

    public String getStages() {
        return stages;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }
}

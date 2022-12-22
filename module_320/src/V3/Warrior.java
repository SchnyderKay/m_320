package V3;

public class Warrior extends Figure{
    public void fight() {
        System.out.println("Warrior is fighting...");
        this.weapon.useWeapon();
    }
}

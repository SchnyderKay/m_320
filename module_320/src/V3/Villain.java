package V3;

public class Villain extends Figure{
    public void fight() {
        System.out.println("Villain is fighting...");
        this.weapon.useWeapon();
    }
}

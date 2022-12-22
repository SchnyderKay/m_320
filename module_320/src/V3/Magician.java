package V3;

public class Magician extends Figure {
    public void fight(){
        System.out.println("Magician is fighting...");
        this.weapon.useWeapon();
    }
}

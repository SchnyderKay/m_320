package V3;

public class Figure {
    String characterName;
    IWeaponsBehavior weapon;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void walk(){
        System.out.println("Walking...");
    }
    public void fight(){
        System.out.println("Fighting...");
    }

    public void setWeapon(IWeaponsBehavior weapon){
        this.weapon = weapon;
    }

    public IWeaponsBehavior getWeapon() {
        return weapon;
    }
}

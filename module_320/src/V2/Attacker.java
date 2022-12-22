/**
 * @author Kay Schnyder
 * <p>
 * This class is the attacker class, which contain the function jogTraining and playing (polymorphism) and the whole class extends the Players Class.
 */

package V2;

public class Attacker extends Player {


    private void jogTraining() {
        System.out.println("jogging");
    }

    public void playing() {
        System.out.println("attacker");
    }
}

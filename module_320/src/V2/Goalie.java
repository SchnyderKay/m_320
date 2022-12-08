/**
 * @author Kay Schnyder
 * @param height
 *
 * This class is the goalie class, which contain the function playing (polymorphism) and the whole class extends the Players Class.
 */

package V2;

public class Goalie extends Player{
    private double height;

    public void playing(){
        System.out.println("goalie");
    }

}

/**
 * @author Kay Schnyder
 * <p>
 * This is the players class, which is a super class with the name parameter.
 */

package V2;

public class Player {
    private String name;


    public void playing() {
        System.out.println("playing");
    }

    private void showName() {
        System.out.println(name);
    }
}

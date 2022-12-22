/**
 * @author Kay Schnyder
 * <p>
 * This is the Team class wich contains the main function a function for getting a team and a function for printing the playing method of each player.
 */

package V2;

import java.util.ArrayList;
import java.util.List;

public class Team {

    /**
     * @return team
     */
    public List<Player> getTeam() {
        List<Player> team = new ArrayList<>();
        team.add(new Goalie());
        for (int i = 0; i <= 16; i++) {
            team.add(new Attacker());
        }
        for (int i = 0; i <= 4; i++) {
            team.add(new Defender());
        }
        return team;
    }


    public void printPlaying() {
        for (Player player : getTeam()) {
            player.playing();
        }
    }

    /**
     * @param args String[] of main function
     */
    public static void main(String[] args) {
        Team team = new Team();
        team.printPlaying();
    }
}

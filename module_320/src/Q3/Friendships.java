package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Friendships {

    List<List<String>> friendships = new ArrayList<>();
    public void makeFriends(String name_one, String name_two){
        List<String> friends = new ArrayList<>();
        friends.add(name_one);
        friends.add(name_two);
        friendships.add(friends);
    }

    public List<String> getFriendsList(String name){
        List<String> friends = new ArrayList<>();
        for (int i = 0; i <= friendships.size()-1; i++) {
            if (Objects.equals(friendships.get(i).get(0), name)){
                friends.add(friendships.get(i).get(1));
            } else if (Objects.equals(friendships.get(i).get(1), name)) {
                friends.add(friendships.get(i).get(0));
            }
        }
        return friends;
    }

    public boolean areFriends(String name_one, String name_two){
        for (int i = 0; i <= friendships.size()-1; i++) {
            if (Objects.equals(friendships.get(i).get(0), name_one)){
                if (Objects.equals(friendships.get(i).get(1), name_two)){
                    return true;
                }
            } else if (Objects.equals(friendships.get(i).get(0), name_two)) {
                if (Objects.equals(friendships.get(i).get(1), name_one)){
                    return true;
                }
            }
        }
        return false;
    }
}

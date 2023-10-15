package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    private static List<String> userFriendsList(String user, List<List<String>> friends) {
        List<String> userFriends = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            List<String> friendRelationship = friends.get(i);

            if (friendRelationship.get(0) == user) {
                userFriends.add(friendRelationship.get(0));
            }

            if (friendRelationship.get(1) == user) {
                userFriends.add(friendRelationship.get(0));
            }
        }
        return userFriends;
    }
}

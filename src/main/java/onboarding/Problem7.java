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

    private static List<String> deleteUserFriend(List<String> visitors, List<String> userFriends) {
        List<String> mutableVisitors = new ArrayList<>(visitors); // visitors를 수정 가능한 리스트로 복사
        mutableVisitors.removeAll(userFriends);
        return mutableVisitors;
    }

    private static List<String> getSortScore(HashMap<String, Integer> score) {
        int friendSize = score.size();

        if (friendSize > 5) {
            friendSize = 5;
        }

        List<Map.Entry<String, Integer>> sortScore = new ArrayList<>(score.entrySet());
        Collections.sort(sortScore, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        List<String> resultScore = new ArrayList<>();
        for (int i = 0; i < friendSize; i++) {
            Map.Entry<String, Integer> entry = sortScore.get(i);
            resultScore.add(String.valueOf(entry.getKey()));
        }
        return resultScore;

    }

    private static List<String> getFriendScore(List<String> friendsfriends, List<String> visitors) {
        HashMap<String, Integer> score = new HashMap<String, Integer>();
        for (String name : friendsfriends) {
            if (!score.containsKey(name)) {
                score.put(name, 10);
            }
            if (score.containsKey(name)) {
                score.put(name, score.get(name) + 10);
            }
        }

        for (String visitorName : visitors) {
            if (!score.containsKey(visitorName)){
                score.put(visitorName, 1);
            }
            if (score.containsKey(visitorName)){
                score.put(visitorName, score.get(visitorName) + 1);
            }
        }
        return getSortScore(score);
    }

}

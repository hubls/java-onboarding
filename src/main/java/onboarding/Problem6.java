package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = duplicateNickName(forms);
        return answer;
    }

    private static boolean duplicateCheck(List<String> crewInformation, int crewIndex, List<List<String>> forms, int theNumberOfCrew) {
        String nicknameMerge = "";
        int nicknameLength = crewInformation.get(1).length();

        if (nicknameLength < 2) {
            return false;
        }

        for (int i = 0; i < crewIndex; i++){
            nicknameMerge += forms.get(i).get(1) + ' ';
        }

        for (int i = crewIndex + 1; i < theNumberOfCrew; i++) {
            nicknameMerge += forms.get(i).get(1) + ' ';
        }

        for (int i = 0; i < nicknameLength - 1; i++) {
            String checkName = crewInformation.get(1).substring(i, i + 2);

            if (nicknameMerge.contains(checkName)) {
                return true;
            }
        }

        return false;
    }

    private static List<String> duplicateNickName(List<List<String>> forms) {
        List<String> duplicateNicknamePeople = new ArrayList<>();
        int theNumberOfCrew = forms.size();

        for (int i = 0; i < theNumberOfCrew; i++) {
            boolean duplicate = duplicateCheck(forms.get(i), i, forms, theNumberOfCrew);


            if (duplicate == true) {
                duplicateNicknamePeople.add(forms.get(i).get(0));
            }
        }

        Collections.sort(duplicateNicknamePeople);
        return duplicateNicknamePeople;
    }

}

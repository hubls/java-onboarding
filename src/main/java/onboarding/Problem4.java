package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        answer = getReverseString(word);
        return answer;
    }

    private static char getReverseUpperChar(char word) {
        char reverseChar = (char) ('A' + 'Z' - word);
        return reverseChar;
    }

    private static char getReverseLowerChar(char word) {
        char reverseChar = (char) ('a' + 'z' - word);
        return reverseChar;
    }

    private static String getReverseString(String word) {
        String reverseString = "";

        for (int i = 0; i < word.length(); i++) {
            char newChar = 0;
            char oldChar = word.charAt(i);

            if (oldChar >= 'a' && oldChar <= 'z') {
                newChar = getReverseLowerChar(oldChar);
            }

            if (oldChar >= 'A' && oldChar <= 'Z') {
                newChar = getReverseUpperChar(oldChar);
            }

            if (oldChar == ' ') {
                newChar = ' ';
            }

            if (newChar == 0) {
                newChar = oldChar;
            }

            reverseString += newChar;
        }
        return reverseString;
    }
}

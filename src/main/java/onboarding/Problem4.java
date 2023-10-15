package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
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
}

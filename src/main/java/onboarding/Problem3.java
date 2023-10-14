package onboarding;
public class Problem3 {
    static final char THREE = '3';
    static final char SIX = '6';
    static final char NINE = '9';
    public static int solution(int number) {
        int answer = 0;
        answer = countClap(number);
        return answer;
    }

    public static int countClap(int number) {
        int count = 0;
        while (number != 0) {
            String numberAsString = Integer.toString(number);

            for (int i = 0; i < numberAsString.length(); i++) {
                if (numberAsString.charAt(i) == THREE) {
                    count += 1;
                }
                if (numberAsString.charAt(i) == SIX) {
                    count += 1;
                }
                if (numberAsString.charAt(i) == NINE) {
                    count += 1;
                }
            }
            number--;
        }
        return count;
    }
}

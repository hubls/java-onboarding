package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        answer = getMoneyConversion(money);
        return answer;
    }

    public static List<Integer> getMoneyConversion(int money) {
        List<Integer> conversionMoney = new ArrayList<>();

        int krw50000 = money / 50000;
        money -= 50000 * krw50000;

        int krw10000 = money / 10000;
        money -= 10000 * krw10000;

        int krw5000 = money / 5000;
        money -= 5000 * krw5000;

        int krw1000 = money / 1000;
        money -= 1000 * krw1000;

        int krw500 = money / 500;
        money -= 500 * krw500;

        int krw100 = money / 100;
        money -= 100 * krw100;

        int krw50 = money / 50;
        money -= 50 * krw50;

        int krw10 = money / 10;
        money -= 10 * krw10;

        int krw1 = money / 1;
        money -= 1 * krw1;

        conversionMoney = List.of(krw50000, krw10000, krw5000, krw1000, krw500, krw100, krw50, krw10, krw1);

        return conversionMoney;
    }
}


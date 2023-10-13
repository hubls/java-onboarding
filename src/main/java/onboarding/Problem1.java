package onboarding;

import java.util.List;

class Problem1 {
    static final int POBI_WINNER = 1;
    static final int CRONG_WINNER = 2;
    static final int DRAW = 0;
    static final int EXCEPTION = -1;

    static final int LEFT_PAGE = 0;
    static final int RIGHT_PAGE = 1;

    static final int MINIMUM_PAGE_NUMBER = 3;
    static final int MAXIMUM_PAGE_NUMBER = 398;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        answer = compareScores(pobi, crong);
        return answer;
    }

    private static int calculateAndReturnMaxResult(int number) {
        int addNumber = 0;
        int multiplyNumber = 1;

        while (number !=0) {
            addNumber += number % 10;
            multiplyNumber *= number % 10;

            number /= 10;
        }
        if (addNumber >= multiplyNumber) {
            return addNumber;
        }

        if (addNumber <= multiplyNumber) {
            return multiplyNumber;
        }

        return -1;
    }

    private static int compareTwoNumber(List<Integer> twoPage) {
        int firstPage = twoPage.get(0);
        int secondPage = twoPage.get(1);

        int firstPageOperationResult = calculateAndReturnMaxResult(firstPage);
        int secondPageOperationResult = calculateAndReturnMaxResult(secondPage);

        if (firstPageOperationResult >= secondPageOperationResult) {
            return firstPageOperationResult;
        }

        if (firstPageOperationResult <= secondPageOperationResult) {
            return secondPageOperationResult;
        }

        return -1;
    }

    private static int isInvalidInput(List<Integer> pobi, List<Integer> crong) {
        if (pobi.size() != 2 || crong.size() != 2) {
            return EXCEPTION;
        }

        if (((pobi.get(0) + 1) != pobi.get(1)) || ((crong.get(0) + 1) != crong.get(1))) {
            return EXCEPTION;
        }

        if ((pobi.get(0) < MINIMUM_PAGE_NUMBER) || (pobi.get(1) > MAXIMUM_PAGE_NUMBER)) {
            return EXCEPTION;
        }

        if ((crong.get(0) < MINIMUM_PAGE_NUMBER) || (crong.get(1) > MAXIMUM_PAGE_NUMBER)) {
            return EXCEPTION;
        }

        if ((pobi.get(0) % 2 == 0) || (crong.get(0) % 2 == 0)) {
            return EXCEPTION;
        }

        return 1;
    }





}
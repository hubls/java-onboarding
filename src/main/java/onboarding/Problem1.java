package onboarding;

import java.util.List;

class Problem1 {

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



}
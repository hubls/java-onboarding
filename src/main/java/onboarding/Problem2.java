package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {
        String answer = decryptCryptogram(cryptogram);
        return answer;
    }

    public static int getSecondTrim(String cryptogram, int firstTrim) {
        int secondTrim = firstTrim + 1;
        while ((cryptogram.charAt(firstTrim) == cryptogram.charAt(secondTrim)) && (secondTrim < cryptogram.length() - 1)) {
            secondTrim += 1;
        }
        return secondTrim;
    }

    public static String decryptCryptogram(String cryptogram) {
        int stringCount = 0;
        int cryptogramLength = cryptogram.length();

        for (int i = 0; i < cryptogramLength - 1; i++) {
            if (cryptogram.charAt(i) != cryptogram.charAt(i + 1)) {
                stringCount += 1;
            }
            if (stringCount == cryptogram.length() - 1) {
                return cryptogram;
            }
        }

        for (int firstTrim = 0; firstTrim < cryptogramLength - 1; firstTrim ++) {
            if (cryptogram.charAt(firstTrim) == cryptogram.charAt(firstTrim + 1)) {
                int secondTrim = getSecondTrim(cryptogram, firstTrim);
                String trimCryptogram = cryptogram.substring(0, firstTrim) + cryptogram.substring(secondTrim, cryptogramLength);
                return decryptCryptogram(trimCryptogram);
            }
        }
        return "";
    }
}

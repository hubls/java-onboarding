package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {
        String answer = decryptCryptogram(cryptogram);
        return answer;
    }

    public static String decryptCryptogram(String cryptogram) {
        int count = 0;
        for (int i = 0; i < cryptogram.length() - 1; i++) {
            if (cryptogram.charAt(i) != cryptogram.charAt(i + 1)) {
                count += 1;
            }
            if (count == cryptogram.length() - 1) {
                return cryptogram;
            }
        }

        for (int i = 0; i < cryptogram.length() - 1; i ++) {

            if (cryptogram.charAt(i) == cryptogram.charAt(i + 1)) {

                int j = i;
                while ((cryptogram.charAt(i) == cryptogram.charAt(j)) && (j < cryptogram.length() - 1))  {
                    j += 1;
                }

                String trimCryptogram = cryptogram.substring(0, i) + cryptogram.substring(j, cryptogram.length());
                return decryptCryptogram(trimCryptogram);
            }
        }
        return "";
    }
}

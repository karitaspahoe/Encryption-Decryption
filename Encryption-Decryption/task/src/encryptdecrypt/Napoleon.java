package encryptdecrypt;

import java.util.Arrays;

public class Napoleon {
    final static char[] cipherLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static String cipherText(String text) {
        String inText = text.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int i;

        for (char c: inText.toCharArray()) {
            if (Character.isLetter(c)) {
                i = Arrays.binarySearch(cipherLetters, c);
                c = cipherLetters[cipherLetters.length-1-i];
            }
            sb.append(c);
        }

        return sb.toString();
    }

}

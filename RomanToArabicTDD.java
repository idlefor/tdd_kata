package TDD;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicTDD {
    static int[] ARABIC_NO = {10 , 9 ,5 , 4, 1};
    static String[] ROMAN_NO = {"X","IX","V","IV","I"};
    public static int convertRomanToArabic(String roman) {

        int count = 0;
        for(int j=0; j < ROMAN_NO.length; j++) {
            // VIII ...  V .. give 5 ... I  give 1 ... so on forth
            while(roman.trim().startsWith(ROMAN_NO[j])) {

                count += ARABIC_NO[j];
                roman = roman.substring(ROMAN_NO[j].length());
            }
        }

        return count;
    }

    static Map<Character, Integer> values = new HashMap<>();
    static {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
    }
    public static int iterative(String roman) {
        int sum = 0;
        for (int i = 0; i < roman.length(); i++) {
            int currValue = values.get(roman.charAt(i));

            if (i+1 < roman.length() && currValue < values.get(roman.charAt(i+1)))
                sum -= currValue;
            else
                sum += currValue;
        }
        return sum;
    }
}

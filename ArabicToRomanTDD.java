package TDD;

public class ArabicToRomanTDD {

    static int[] ARABIC_DIGIT = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;
    static String[] ROMAN_DIGIT = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"} ;

    public static String convert(int arabic) {
        String roman = "";

       for(int i =0; i < ARABIC_DIGIT.length; i++){
           while(arabic >= ARABIC_DIGIT[i]) {
               roman += ROMAN_DIGIT[i];
               arabic -= ARABIC_DIGIT[i];
           }
       }
        return roman;
    }
}

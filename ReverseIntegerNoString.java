package TDD;

public class ReverseIntegerNoString {
        //  Read more: https://www.java67.com/2015/08/how-to-reverse-integer-in-java-leetcode-solution.html#ixzz7Zgh6GPEG
        public static void main(String args[]) {
            int input = 1234; // 9646324351      2147483647
            int output = reverseInteger(input);
            System.out.println("Input : " + input + " Output : " + output);
        }
        /* * Java method to reverse an integer value. there are couple of * corner cases * which this method doesn't handle e.g. integer overflow. */
        public static int reverseInteger(int number) {
            boolean isNegative = number < 0 ? true : false;
            if(isNegative){
                number = number * -1;
            }
            int reverse = 0;
            int lastDigit = 0;
            while (number > 0) {
                if (number  > Integer.MAX_VALUE / 10 || number < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                lastDigit = number % 10; // gives you last digit by using modulus of 10
                reverse = reverse * 10 + lastDigit; // append the reverse the digit to be output later when while loop keep iterate
                number = number / 10; // get rid of last digit by division of ten
            }
            return isNegative ? reverse*-1 : reverse;
        }
}
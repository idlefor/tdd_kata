package TDD;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorTDD {

    public static int add(String s) {
        if(!s.isEmpty()) {
            List<Integer> numberList = splitStringIntoNumberArr(s);
            negative(numberList);

            return numberList
                    .stream()
                    .reduce(Integer::sum)
                    .orElseThrow(NumberFormatException::new);
        }

        return 0;
    }

    private static void negative (List<Integer> numbers) {
        StringBuilder stringbuilder = new StringBuilder ();

      numbers.stream()
              .filter(num -> num <0)
              .forEach(num -> stringbuilder.append(num).append(" "));
        if(!stringbuilder.toString().isEmpty())
            throw new RuntimeException("negative no not allow!" + stringbuilder.toString());
    }

    private static List<Integer> splitStringIntoNumberArr(final String s) {
        return Arrays.stream(getSplit(s))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static String[] getSplit(final String s) {
        return s.split(",|\n");
    }
}
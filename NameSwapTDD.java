package TDD;

import java.util.Arrays;
import java.util.List;

public class NameSwapTDD {

    public static String invert(final String s) {
        List<String> stringParts = Arrays.asList(s.split("\\s+"));

        String firstName;
        String lastName;
        if(stringParts.size() <2) {
            return stringParts.get(0);
        }
        firstName = stringParts.get(0);
        lastName = stringParts.get(1);

        return String.format("%s, %s", lastName, firstName);
    }
}

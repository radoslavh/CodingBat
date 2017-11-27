package Functional2;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
 */
public class No34 {

    public List<String> no34(List<String> strings) {
        strings.removeIf(str -> str.length() == 3 || str.length() == 4);
        return strings;
    }
}

package Functional1;

import java.util.List;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 */
public class Copies3 {
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }
}

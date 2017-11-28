package Functional2;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string that contains a "z".
 * (Note: the str.contains(x) method returns a boolean)
 */
public class NoZ {

    public List<String> noZ(List<String> strings) {
        strings.removeIf(str->str.contains("z"));
        return strings;
    }
}

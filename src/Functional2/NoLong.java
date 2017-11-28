package Functional2;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 */
public class NoLong {

    public List<String> noLong(List<String> strings) {
        strings.removeIf(s->s.length()>=4);
        return strings;
    }
}

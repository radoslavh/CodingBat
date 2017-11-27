package Functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its end,
 * omitting any resulting strings that contain "yy" as a substring anywhere.
 */
public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings = strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
        return strings;
    }
}

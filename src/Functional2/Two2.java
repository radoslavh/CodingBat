package Functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2,
 * omitting any of the resulting numbers that end in 2.
 */
public class Two2 {

    public List<Integer> two2(List<Integer> integers) {
        integers = integers.stream()
                .map(n->n*2)
                .filter(n->n%10!=2)
                .collect(Collectors.toList());

        return integers;
    }
}

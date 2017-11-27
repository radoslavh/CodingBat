package Functional1;

import com.sun.tools.javac.util.List;

/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 */
public class Doubling {

    public List<Integer> doubling(List<Integer> integers) {
        integers.replaceAll(n -> n * 2);
        return integers;
    }
}

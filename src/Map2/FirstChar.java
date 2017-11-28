package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
 * with the value of all the strings starting with that character appended together in the order they appear in the array.
 */
public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String first = "" + s.charAt(0);
            if (map.containsKey(first)) {
                map.put(first, map.get(first) + s);
            } else {
                map.put(first, s);
            }
        }
        return map;
    }
}

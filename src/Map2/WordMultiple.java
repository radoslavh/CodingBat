package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean>
 * where each different string is a key and its value is true if that string appears 2 or more times in the array.
 */
public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();

        for (String s : strings) {
            map.put(s, map.containsKey(s));
        }
        return map;
    }
}

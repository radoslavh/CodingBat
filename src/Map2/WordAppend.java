package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Loop over the given array of strings to build a result string like this:
 * when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
 * Return the empty string if no string appears a 2nd time.
 */
public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (String key : strings) {
            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result += key;
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }
        }
        return result;
    }
}

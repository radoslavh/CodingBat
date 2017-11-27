package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
 * for each string add its first character as a key with its last character as the value.
 */
public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();

        for (String s : strings) {

            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return map;
    }

}

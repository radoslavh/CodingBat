package Map1;

import java.util.Map;

/**
 * Modify and return the given map as follows:
 * if exactly one of the keys "a" or "b" has a value in the map (but not both),
 * set the other to have that same value in the map.
 */
public class MapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        boolean a = map.containsKey("a");
        boolean b = map.containsKey("b");
        if (!(a && b)) {
            if (a) map.put("b", map.get("a"));
            if (b) map.put("a", map.get("b"));
        }

        return map;
    }
}

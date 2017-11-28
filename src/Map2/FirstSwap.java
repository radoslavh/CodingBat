package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 * We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 * Loop over and then return the given array of non-empty strings as follows:
 * if a string matches an earlier string in the array, swap the 2 strings in the array.
 * A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
 * Using a map, this can be solved making just one pass over the array. More difficult than it looks.
 */
public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i].substring(0, 1);

            if (map.containsKey(key)) {

                int val = map.get(key);
                if (val == -1) {
                    continue;
                }

                // swap
                int pos      = map.get(key);
                String tmp   = strings[pos];
                strings[pos] = strings[i];
                strings[i]   = tmp ;

                // set a flag
                map.put(key, -1);

            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}

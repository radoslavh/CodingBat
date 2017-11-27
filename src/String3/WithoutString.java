package String3;

/**
 * Given two strings, base and remove,
 * return a version of the base string where all instances of the remove string have been removed (not case sensitive).
 * You may assume that the remove string is length 1 or more.
 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */
public class WithoutString {
    public String withoutString(String base, String remove) {
        String result = "";

        int pos = base.toLowerCase().indexOf(remove.toLowerCase());
        while (pos != -1) {
            result += base.substring(0, pos);
            base = base.substring(pos + remove.length());

            pos = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        result += base;
        return result;
    }
}

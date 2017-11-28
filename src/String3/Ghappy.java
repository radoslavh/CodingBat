package String3;

/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
 * Return true if all the g's in the given string are happy
 */
public class Ghappy {
    public boolean gHappy(String str) {
        str = "X" + str + "X"; // for corner cases
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') return false;
        return true;
    }
}

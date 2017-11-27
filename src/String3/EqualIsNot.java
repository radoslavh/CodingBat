package String3;

/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string
 * is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */
public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        str += " ";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) is++;
            if (str.substring(i, i + 3).equals("not")) not++;
        }
        return (is == not);
    }
}

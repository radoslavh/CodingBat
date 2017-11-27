package Array2;

/**
 * Given a number n, create and return a new string array of length n,
 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
 * Note: String.valueOf(xxx) will make the String form of most types.
 * The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
 */
public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] word = new String[n];
        for (int i = 0; i < word.length; i++) {
            word[i] = Integer.toString(i);
        }
        return word;
    }
}
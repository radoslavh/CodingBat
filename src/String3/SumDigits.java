package String3;

/**
 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
 * Return 0 if there are no digits in the string.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 */
public class SumDigits {
    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.isDigit(a)) sum += Integer.parseInt(a + "");

        }
        return sum;
    }
}

package WarmUp1;

/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
public class Dif21 {

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}

package Logic1;

/**
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 * So for example 38 and 39 return true, but 40 returns false.
 */
public class Less20 {
    public boolean less20(int n) {
        return (n % 20 >= 18);
    }
}

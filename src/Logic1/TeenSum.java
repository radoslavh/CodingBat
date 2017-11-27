package Logic1;

/**
 * Given 2 ints, a and b, return their sum.
 * However, "teen" values in the range 13..19 inclusive, are extra lucky.
 * So if either value is a teen, just return 19.
 */
public class TeenSum {
    public int teenSum(int a, int b) {
        int sum = a + b;
        return (19 >= a && a >= 13 || 19 >= b && b >= 13) ? 19 : sum;
    }
}

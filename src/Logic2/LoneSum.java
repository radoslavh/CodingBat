package Logic2;

/**
 * Given 3 int values, a b c, return their sum.
 * However, if one of the values is the same as another of the values, it does not count towards the sum.
 */
public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) return 0;
        if (a == c) sum -= a + c;
        if (a == b) sum -= a + b;
        if (b == c) sum -= b + c;
        return sum;
    }
}

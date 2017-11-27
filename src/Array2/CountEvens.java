package Array2;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 */
public class CountEvens {
    public int countEvens(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (isEven(num)) counter++;
        }
        return counter;
    }

    private boolean isEven(int num) {
        return (num & 1) == 0;
    }
}

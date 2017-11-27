package Array3;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive.
 * A single value has a span of 1.
 * Returns the largest span found in the given array. (Efficiency is not a priority.)
 */
public class MaxSpan {

    public int maxSpan(int[] nums) {
        int span = 1;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                if (a == nums[j]) {
                    if (span <= j - i) span = j - i + 1;
                }
            }
        }
        return span;
    }
}

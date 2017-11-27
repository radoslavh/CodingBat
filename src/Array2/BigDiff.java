package Array2;

/**
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
 */
public class BigDiff {
    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = min;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }

        return max - min;
    }
}

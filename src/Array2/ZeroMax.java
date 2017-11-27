package Array2;

/**
 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
 * If there is no odd value to the right of the zero, leave the zero as a zero.
 */
public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int max;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        if (max < nums[j]) max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }
}

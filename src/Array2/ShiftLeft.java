package Array2;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 * You may modify and return the given array, or return a new array.
 */
public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;
        int[] shifted = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            shifted[i - 1] = nums[i];
        }
        shifted[nums.length - 1] = nums[0];

        return shifted;
    }
}

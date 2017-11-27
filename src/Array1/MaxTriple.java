package Array1;

/**
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
 * The array length will be a least 1.
 */
public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];
        int mid = nums.length / 2;
        int end = nums.length - 1;

        if (nums[0] >= nums[mid]) {
            if (max < nums[end]) max = nums[end];
        } else {
            max = nums[mid];
            if (max < nums[end]) max = nums[end];
        }

        return max;
    }
}

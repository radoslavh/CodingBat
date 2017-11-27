package Array2;

/**
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
 */
public class Sum13 {
    public int sum13(int[] nums) {

        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];

        }
        return sum;
    }
}

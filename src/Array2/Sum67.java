package Array2;

/**
 * Return the sum of the numbers in the array,
 * except ignore sections of numbers starting with a 6 and extending to the next 7
 * (every 6 will be followed by at least one 7). Return 0 for no numbers.
 */
public class Sum67 {
    public int sum67(int[] nums) {
        boolean write = true;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) write = false;

            if (write) {
                sum += nums[i];
            }
            if (nums[i] == 7 && !write) write = true;
        }
        return sum;
    }
}

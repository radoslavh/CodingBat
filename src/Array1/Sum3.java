package Array1;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 */
public class Sum3 {
    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

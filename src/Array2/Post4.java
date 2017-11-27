package Array2;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
 * The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 */
public class Post4 {
    public int[] post4(int[] nums) {
        int[] result = nums;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                result = new int[nums.length - i - 1];
                for (int j = i + 1, k = 0; j < nums.length; j++, k++)
                    result[k] = nums[j];
                break;
            }
        }
        return result;
    }

}

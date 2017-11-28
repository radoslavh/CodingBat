package Array2;

/**
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order.
 * You may modify and return the given array, or make a new array.
 */
public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                result[even++] = nums[i];
            else
                result[odd--] = nums[i];
        }
        return result;
    }
}

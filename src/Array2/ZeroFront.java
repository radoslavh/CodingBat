package Array2;

/**
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array. T
 * he order of the non-zero numbers does not matter.
 * So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */
public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zeros = 0;
        int noZeros = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                result[zeros++] = nums[i];
            else
                result[noZeros--] = nums[i];
        }
        return result;
    }
}

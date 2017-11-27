package Array2;

/**
 * Return a version of the given array where all the 10's have been removed.
 * The remaining elements should shift left towards the start of the array as needed,
 * and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
 * You may modify and return the given array or make a new array.
 */
public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];

        int rest = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=10)
                result[rest++]=nums[i];
        }
        return result;
    }
}

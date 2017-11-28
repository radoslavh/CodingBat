package Array2;

/**
 * Given an array of ints, return true if the array contains two 7's next to each other,
 * or there are two 7's separated by one element, such as with {7, 1, 7}.
 */
public class Has77 {
    public boolean has77(int[] nums) {
        boolean isSeven = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 7 && nums[i - 1] == 7) isSeven = true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 2] == 7 && !isSeven) isSeven = true;
        }
        return isSeven;
    }
}

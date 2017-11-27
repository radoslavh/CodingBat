package Array2;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 */
public class Either24 {
    public boolean either24(int[] nums) {
        boolean next2 = false;
        boolean next4 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) next2 = true;
            if (nums[i] == 4 && nums[i + 1] == 4) next4 = true;
        }
        return next2 ^ next4;
    }
}

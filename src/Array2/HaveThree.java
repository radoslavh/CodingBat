package Array2;

/**
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 */
public class HaveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) count++;
        }

        if (count != 3) return false;
        else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 3 && nums[i + 1] == 3) return false;
            }
        }
        return true;
    }
}

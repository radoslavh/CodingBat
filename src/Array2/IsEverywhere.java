package Array2;

/**
 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
 * at least one of the pair is that value. Return true if the given value is everywhere in the array.
 */
public class IsEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i < nums.length; i += 2)
            if (nums[i] != val) flag1 = false;

        for (int i = 0; i < nums.length - 1; i += 2)
            if (nums[i + 1] != val) flag2 = false;

        return flag1 || flag2;
    }
}

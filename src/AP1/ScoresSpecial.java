package AP1;

/**
 * Given two arrays, A and B, of non-negative int scores.
 * A "special" score is one which is a multiple of 10, such as 40 or 90.
 * Return the sum of largest special score in A and the largest special score in B.
 * To practice decomposition, write a separate helper method which finds the largest special score in an array.
 * Write your helper method after your scoresSpecial() method in the JavaBat text area.
 */
public class ScoresSpecial {

    public int scoresSpecial(int[] a, int[] b) {
        int sum = 0;
        sum = helper(a) + helper(b);
        return sum;
    }

    private int helper(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num % 10 == 0 && num > max) max = num;
        }
        return max;
    }
}

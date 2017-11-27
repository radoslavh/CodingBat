package AP1;

/**
 * Given an array of scores, return true if each score is equal or greater than the one before.
 * The array will be length 2 or more.
 */
public class ScoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        boolean result = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) return false;
        }
        return result;
    }
}
